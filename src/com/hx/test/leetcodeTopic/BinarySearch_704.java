package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 704. 二分查找
 * @author: hux
 * @create: 2020-06-30 16:31
 **/
public class BinarySearch_704 {
    public static int search(int[] nums, int target) {
        if (nums==null) return -1;
        int low=0,high=nums.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (target<nums[mid]) high=mid-1;
            else if (target>nums[mid]) low=mid+1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=13;
        System.out.println(search(nums,target));
    }
}
