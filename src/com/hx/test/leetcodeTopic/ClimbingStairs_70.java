package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 70. 爬楼梯
 * @date
 */
public class ClimbingStairs_70 {
    private static int climbStairs(int n) {
        if (n<=2){
            return n;
        }
        int r1=1;
        int r2=2;
        for (int i=3;i<=n;i++){
            int tmp=r1+r2;
            r1=r2;
            r2=tmp;
        }
        return r2;

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
