package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 50. Pow(x, n)
 * @author: hux
 * @create: 2020-05-25 18:37
 **/
public class Powxn_50 {
    /**
    * @Description: 该方法超时了
    * @Param: [x, n]
    * @return: double
    * @Author: hux
    * @Date: 2020/5/25
    */
    private static double myPow1(double x, int n) {
        double result=1;
        long N = Math.abs((long) n);
        for (int i=0;i<N;i++){
            result=result*x;
        }
        return n<0?1/result:result;
    }

    private static double myPow(double x, int n) {
        // 判断一下n的正负
        if(n >= 0)
            return p(x, (long)n);
        else
            return 1.0/ p(x, -(long)n);
    }

    // 计算正整数n的情况
    static double p(double x, long N){
        if(N == 0) return 1.0;  // 递归停止条件
        double y = p(x, N/2);   // 二分
        return N%2 == 0? y*y : y*y*x; // 根据n的奇偶不同返回
    }

    public static void main(String[] args) {
        double x=2.00000;
        int n=3;
        System.out.println(myPow(x,n));
    }
}
