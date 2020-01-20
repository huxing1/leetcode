package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 最大子序和
 * @date
 */
public class MaximumSubarray_53 {
    public static int maxSubArray(int[] nums) {
        int result=nums[0];
        int sum=0;
        for (int i=0;i<nums.length;i++){
            if (sum>0){
                sum +=nums[i];
            }else {
                //sum负数不相加
                sum = nums[i];
            }
            result = Integer.max(result, sum);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums={-2,1};
        System.out.println(maxSubArray(nums));
    }
}
