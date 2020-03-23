package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 80. 删除排序数组中的重复项 II
 * @date
 */
public class RemoveDuplicatesFromSortedArrayII_80 {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for (int num:nums){
            if (i<2||num>nums[i-2]) nums[i++]=num;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
