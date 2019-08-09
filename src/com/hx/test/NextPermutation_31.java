package com.hx.test;

public class NextPermutation_31 {
    public static void main(String[] args) {
        int[] testNums=new int[]{2, 1, 8, 4, 2, 1};
        nextPermutation(testNums);
        for (int i = 0; i < testNums.length; i++)
        {
            System.out.print(testNums[i]);
        }

    }

    private static void swap(int nums[],int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
    /**
     * @Author huxing
     * @Description 下一个排列(就是找到比当前数字更大一点的数字，没有就返回最小的数字排列)
     * 解题思路：2,1,8,4,2,1 ； 首先从右到左找到递减的数字8,4,2,1，就可以找到左边一位1的位置p,
     * 将p和右边比他大一点的数字交换位置，得到228411,将8411俩边俩俩交换位置，得到递减的数字1248
     * @Date 11:33 2019/8/9
     * @param nums
     * @return int[]
    **/
    public static int[] nextPermutation(int[] nums) {
        if (nums==null||nums.length<2) return nums;
        int n=nums.length;
        int p=n-2;
        while (p>=0&&nums[p]>=nums[p+1]) --p;
        if (p>=0){
            int i=n-1;
           while (i>p&&nums[i]<=nums[p]) --i;
           swap(nums,i,p);
        }
        for (int i=p+1,j=n-1;i<=j;++i,--j){
            swap(nums,i,j);
        }
        return nums;
    }
}
