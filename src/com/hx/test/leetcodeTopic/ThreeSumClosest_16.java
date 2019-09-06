package com.hx.test.leetcodeTopic;

import java.util.Arrays;

public class ThreeSumClosest_16 {
    public int threeSumClosest(int[] nums ,int target){
        Arrays.sort(nums);
        long minDiff=Long.MAX_VALUE;
        int result=0;
        int diff=0;
        int sum=0;
        for (int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                sum=nums[i]+nums[j]+nums[k];
                diff=Math.abs(sum-target);
                if (diff==0){
                    return sum;
                }if (diff<minDiff){
                    minDiff=diff;
                    result=sum;
                }if (sum>target){
                    k--;
                }else {
                    j++;
                }

            }

        }
        return result;
    }
}
