package com.hx.test.leetcodeTopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author
 * @description 全排列
 * @date
 */
public class Permutations_46 {

    static void permuteRec(List<Integer> nums, int start, List<List<Integer>> result) {
        if (start == nums.size()) {
            result.add(new ArrayList<>(nums));
        } else {
            for (int i = start; i < nums.size(); ++i) {
                Collections.swap(nums, i, start);
                permuteRec(nums, start + 1, result);
                Collections.swap(nums, i, start);
            }
        }
    }

    // Time: O(n*n!), Space: O(n)
    public static List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        for (int num: nums) list.add(num);

        permuteRec(list, 0, result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> lists= permute(nums);

        for (List<Integer> list:lists){
            for (int result:list){
                System.out.print(result+"");
            }
            System.out.println(" ");
        }
    }
}
