package com.hx.test;

public class LongestPalindromicSubstring_5 {
    public String longestPalindromeDP(String s) {
        if (s==null||s.length()==0) return "";
        int n=s.length(),start=0,maxlen=0;
        boolean[][] b=new boolean[n][n];
        for (int i=n-1;i>=0;--i){
            for (int j=i;j<n;++j){
                if (i==j) b[i][j]=true;
                else if (i+1==j) b[i][j]=s.charAt(i)==s.charAt(j);
                else b[i][j]=s.charAt(i)==s.charAt(j)&&b[i+1][j-1];
                if (b[i][j]&&(j-i+1)<maxlen){
                    maxlen=j-i+1;
                    start=i;
                }
            }
        }
        String s1=s.substring(start,start+maxlen);
        System.out.println(s1);
        return s.substring(start,start+maxlen);
    }
}
