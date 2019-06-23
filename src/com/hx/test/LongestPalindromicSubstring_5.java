package com.hx.test;

public class LongestPalindromicSubstring_5 {
    // Time: O(n^2), Space: O(n^2)
    //通过滑动窗口，从右至左，逐渐减小，j从i的位置开始逐渐增大，
    // 分为三种：1，i=j时，直接返回true
    // 2,i+1=j时，判断二者是否相等，则返回ture
    // 3，i和j不相邻时，判断i和j对应的值相等，且中间也是回文子串（中间是不是回文是通过前面循环一步一步得出来的）
    public String longestPalindromeDP(String s) {
        //当字符串为空时，返回0
        if (s==null||s.length()==0) return "";
        int n=s.length(),start=0,maxlen=0;
        //初始化boolean类型
        boolean[][] b=new boolean[n][n];
        for (int i=n-1;i>=0;--i){
            for (int j=i;j<n;++j){
                //i=j时
                if (i==j) b[i][j]=true;
                //i和j相邻时
                else if (i+1==j) b[i][j]=s.charAt(i)==s.charAt(j);
                //i和j不相邻时
                else b[i][j]=s.charAt(i)==s.charAt(j)&&b[i+1][j-1];
                if (b[i][j]&&(j-i+1)>maxlen){
                    maxlen=j-i+1;
                    start=i;
                }
            }
        }
        String s1=s.substring(start,start+maxlen);
        System.out.println(s1);
        return s.substring(start,start+maxlen);
    }

    int expand(String s,int left,int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            --left;++right;
        }
        //右边的边界此时是right-1,左边的边界此时是left+1,所以子串长度为(right-1)-(left+1)+1
        return right-left-1;
    }

    //这种方式是通过判断回文子串的中心位置的俩边是否相等来得出回文子串
    //注意区分（bab baab）这俩种情况
    public String longestPalindromeExpand(String s){
        if (s.length()==0||s==null) return "";
        int start=0,max=0;
        for (int i=s.length()-1;i>=0;--i){
            //奇数情况
            int len1=expand(s,i,i);
            //偶数情况
            int len2=expand(s,i,i+1);
            if (max<Math.max(len1,len2)) {
                max=Math.max(len1,len2);
                start=i-(max-1)/2;
            }

        }
        System.out.printf(s.substring(start,start+max));
        //注意不截取左边的字符，且要截取第一个字符需要从第一位开始
        return s.substring(start,start+max);

    }
}
