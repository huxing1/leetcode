package com.hx.test;

import java.util.Arrays;

public class RemoveElement_27 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        removeElement(nums, 3);
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println((nums[i]));
        }
    }

    public static int removeElement(int[] nums, int val) {
        //不知道为啥Array.Copyof这个方法不行
        int count=0;
        for (int i=0;i<nums.length;++i){
            if (nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
