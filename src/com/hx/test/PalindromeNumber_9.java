package com.hx.test;

//leetcode-9
public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        //个位数为0可以直接返回
        if (x<0||(x%10==0&&x!=0)) return false;
        int revertedNumber=0;
        while (x>revertedNumber){
            //获取x取余后的反转数字
            revertedNumber=x%10+revertedNumber*10;
            x=x/10;
        }
        //返回偶数情况下及奇数情况下
        return x==revertedNumber||x==revertedNumber/10;
    }
}

