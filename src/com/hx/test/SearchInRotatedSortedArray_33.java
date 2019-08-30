package com.hx.test;

public class SearchInRotatedSortedArray_33 {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 0, 1, 2, 4};
//        int[] nums={};
        int target = 8;
        System.out.println(search(nums, target));

    }

    /**
     * @param nums
     * @param target
     * @return int
     * @Author huxing
     * @Description 搜索旋转排序数组:
     * 1 2 3 4 5 6 7 可以大致分为两类,
     * 第一类 2 3 4 5 6 7 1这种，也就是nums[start] <= nums[mid]。此例子中就是2 <= 5
     * 这种情况下，前半部分有序。因此如果 nums[start] <=target<nums[mid]。则在前半部分找，
     * 否则去后半部分找。
     * 第二类 6 7 1 2 3 4 5这种，也就是nums[start] > nums[mid]。此例子中就是6 > 2
     * 这种情况下，后半部分有序。因此如果 nums[mid] <target<=nums[end]。则在后半部分找，
     * 否则去前半部分找
     * @Date 15:13 2019/8/22
     **/
    public static int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null)
        {
            return -1;
        }
        int mid;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end)
        {
            mid = start + (end - start) / 2;
            if (nums[mid] == target)
            {
                return mid;
            }

            if (nums[start] > nums[mid])
            {
                if (target > nums[mid] && target <= nums[end])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
            else
            {
                if (target < nums[mid] && target >= nums[start])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
