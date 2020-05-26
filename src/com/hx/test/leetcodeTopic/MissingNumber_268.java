package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 268. 缺失数字
 * 异或是啥？
 * @author: hux
 * @create: 2020-05-26 17:22
 **/
public class MissingNumber_268 {
    public static int missingNumber(int[] nums) {
        int n=nums.length,result=n;
        for (int i=0;i<n;++i) {
            result=result^i^nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={4,1,0,2};
        System.out.println(missingNumber(nums));
    }
}
