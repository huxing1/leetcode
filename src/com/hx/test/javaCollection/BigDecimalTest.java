package com.hx.test.javaCollection;

import java.math.BigDecimal;

/**
 * @program: leetcode
 * @description:
 * @author: hux
 * @create: 2020-07-01 11:00
 **/
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(Double.toString(1.0));
        BigDecimal b2 = new BigDecimal(Double.toString(0.9));
        System.out.println(b1.subtract(b2));
    }
}
