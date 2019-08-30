package com.hx.test;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int[] result = binarySearchFirstAndLastPosition(nums, target);
        for (int num : result)
        {
            System.out.println(num);
        }
    }

    /**
     * @Author huxing
     * @Description 方法一：暴力法
     * @Date 11:48 2019/8/27
     * @param nums
     * @param target
     * @return int[]
    **/
    public static int[] findFirstAndLastPosition(int[] nums,int target){
        if (nums==null||nums.length==0) return new int[]{-1,-1};
        int n=nums.length,start=-1,end=-1;
        for (int i=0;i<n;++i){
            if (target==nums[i]) {
                start=i;
                break;
            }
        }
        for (int j=n-1;j>=0;--j){
            if (target==nums[j]){
                end=j;
                break;
            }
        }

        return new int[]{start,end};
    }


    private static int binarySearchLastNum(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (target<nums[mid]) high=mid-1;
            else low=mid+1;
        }
        return high;
    }

    /**
     * @Author huxing
     * @Description 方法二：二分法求解
     * @Date 11:49 2019/8/27
     * @param nums
     * @param target
     * @return int[]
    **/
    // Time: O(log(n)), Space: O(1)
    public static int[] binarySearchFirstAndLastPosition(int[] nums, int target) {
        if (nums==null||nums.length==0) return new int[]{-1, -1};
        int end=binarySearchLastNum(nums,target);
        int start=binarySearchLastNum(nums,target-1)+1;
        if (start<=end&&start>=0&&end<nums.length){
            return new int[]{start,end};
        }
        return new int[]{-1, -1};
    }
}
