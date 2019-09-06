package com.hx.test.leetcodeTopic;


public class RemoveDuplicatesfromSortedArray_26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        for (int num:nums)
        {
            System.out.print(num);
        }
    }
    /**
     * @Author huxing
     * @Description 删除排序数组中的重复项
     * @Date 14:59 2019/7/29
     * @param nums
     * @return int
    **/
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; ++i)
        {
            if (nums[i] != nums[i - 1])
            {
                //将i处的值覆盖到K处,覆盖之后的数组为0123422334，题目只要求取前k位即可
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
