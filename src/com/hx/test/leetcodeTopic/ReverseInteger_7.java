package com.hx.test.leetcodeTopic;

public class ReverseInteger_7 {
    public int reverse(int x) {
        long result = 0;
        //防止结果溢出
        long tmp = x;
        while (tmp != 0)
        {
            result = result * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        //溢出判断
        if (result <= Integer.MIN_VALUE || result >= Integer.MAX_VALUE)
        {
            result = 0;
        }
        System.out.println(result);
        return (int) result;
    }


}
