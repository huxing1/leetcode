package com.hx.test.leetcodeTopic;


public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));

    }

    public static int searchInsert2(int[] nums, int target) {
        int len = nums.length;
        if (nums[len - 1] < target) {
            return len;
        }

        int left = 0;
        int right = len - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            // 等于的情况最简单，我们应该放在第 1 个分支进行判断
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // 题目要我们返回大于或者等于目标值的第 1 个数的索引
                // 此时 mid 一定不是所求的左边界，
                // 此时左边界更新为 mid + 1
                left = mid + 1;
            } else {
                // 既然不会等于，此时 nums[mid] > target
                // mid 也一定不是所求的右边界
                // 此时右边界更新为 mid - 1
                right = mid - 1;
            }
        }
        // 注意：一定得返回左边界 left，
        // 如果返回右边界 right 提交代码不会通过
        // 【注意】下面我尝试说明一下理由，如果你不太理解下面我说的，那是我表达的问题
        // 但我建议你不要纠结这个问题，因为我将要介绍的二分查找法模板，可以避免对返回 left 和 right 的讨论

        // 理由是对于 [1,3,5,6]，target = 2，返回大于等于 target 的第 1 个数的索引，此时应该返回 1
        // 在上面的 while (left <= right) 退出循环以后，right < left，right = 0 ，left = 1
        // 根据题意应该返回 left，
        // 如果题目要求你返回小于等于 target 的所有数里最大的那个索引值，应该返回 right

        return left;
    }


    /**
     * @Author huxing
     * @Description 搜索插入位置--二分查找
     * @Date 11:35 2019/8/28
     * @param nums
     * @param target
     * @return int
    **/
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums == null) return 0;
        if (nums[nums.length-1]<target) return nums.length;
        int start = 0, end = nums.length - 1;
        while (start <= end)
        {

            int mid = start + (end-start) / 2;
            if (target==nums[mid]){
                return mid;
            }else if (target<nums[mid]){
                end=mid-1;
            }else if (target>nums[mid]){
                start=mid+1;
            }
        }

        return start;
    }
}
