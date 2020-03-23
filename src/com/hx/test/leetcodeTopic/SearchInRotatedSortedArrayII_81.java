package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 81. 搜索旋转排序数组 II
 * @date
 */
public class SearchInRotatedSortedArrayII_81 {
    private static boolean search(int[] nums, int target) {
        if (nums==null||nums.length==0) return false;
        int start=0,end=nums.length-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if (nums[mid]==target) return true;
            if (nums[mid]==nums[start]) {
                start++;
                //TODO continue在这里是干什么的
                continue;
            }
            if (nums[mid]>nums[start]){
                if (nums[mid]>target&&nums[start]<=target){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else{
                if (nums[mid]<target&&nums[end]>=target){
                    start=mid+1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={2,5,6,0,0,1,2};
        int target=1;
        System.out.println(search(nums,target));
    }
}
