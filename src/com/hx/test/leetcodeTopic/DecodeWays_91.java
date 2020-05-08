package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 91. 解码方法
 * @author: hux
 * @create: 2020-03-25 17:16
 **/
public class DecodeWays_91 {
    private static int numDecodings(String s) {
        char[] arr=s.toCharArray();
        int[] results=new int[s.length()+1];
        results[0]=1;
        results[1]=arr[0]=='0'?0:1;
        if (s.length()<=1) return results[1];
        for (int i=2;i<=arr.length;i++){
            int n=(arr[i-2]-'0')*10+(arr[i-1]-'0');
            if (arr[i-2]=='0'&&arr[i-1]=='0') return 0;
            else if (arr[i-2]=='0') results[i]=results[i-1];
            else if (arr[i-1]=='0') {
                if (n>26) return 0;
                else results[i]=results[i-2];
            }
            else if (n<=26) results[i]=results[i-1]+results[i-2];
            else results[i]=results[i-1];
        }
        return results[results.length-1];
    }

    public static void main(String[] args) {
        String s="2210";
        System.out.println(numDecodings(s));
    }
}
