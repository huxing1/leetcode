package com.hx.test.leetcodeTopic;

public class RomanToInteger_13 {
    public int romanToInt(String s) {
        int sum=0;
        int cur,next;
        for (int i=0;i<s.length()-1;i++){
            //判断数字小的在数字大的左边的情况，需要把小数字减掉（比如4）
            cur=getValue(s.charAt(i));
            next=getValue(s.charAt(i+1));
            sum=cur<next?sum-cur:sum+cur;
        }
        //循环没有加上最后一个数字，需要加上
         sum +=getValue(s.charAt(s.length()-1));
        return sum;
    }
    private static int getValue(char s){
        switch (s){
            case 'I' :return 1;
            case 'V' :return 5;
            case 'X' :return 10;
            case 'L' :return 50;
            case 'C' :return 100;
            case 'D' :return 500;
            case 'M' :return 1000;
            default:
                return 0;
        }
    }
}
