package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 263. 丑数
 * @author: hux
 * @create: 2020-09-14 17:33
 **/
public class UglyNumber_263 {
    public static boolean isUgly(int num) {
        if (num <= 0) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }

    public static void main(String[] args) {
        int num=30;
        System.out.println(isUgly(num));
    }
}
