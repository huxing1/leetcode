package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 88. 合并两个有序数组
 * @date
 */
public class MergeSortedArray_88 {
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
       //注意m--和--m的区别
        int p=m-- + n-- -1;
        while (m>=0&&n>=0){
            nums1[p--]=nums1[m]>nums2[n]?nums1[m--]:nums2[n--];
        }

        while (n>=0){
            nums1[p--]=nums2[n--];
        }
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);
    }
}
