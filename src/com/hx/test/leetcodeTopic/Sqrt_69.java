package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 69. x 的平方根
 * 二分法
 * @date
 */
public class Sqrt_69 {
    public static int mySqrt(int x) {
        long low=0,high=x;
        while (low<=high){
            long mid=low+(high-low)/2;
            long mid2=mid*mid;
            if (mid2<x) low=mid+1;
            else if (mid2>x) high=mid-1;
            else return (int) mid;
        }
        return (int) high;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
