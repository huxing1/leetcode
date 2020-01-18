package com.hx.test.leetcodeTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @description 组合总和
 * @date
 */
public class CombinationSum_39 {

    private static void combSum(int[] nums, int target, int start,
                         List<Integer> elem, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(elem));
            return;
        }
        if (target < 0) return;
        for (int i = start; i < nums.length; ++i) {
            elem.add(nums[i]);
            combSum(nums, target-nums[i], i, elem, result);
            elem.remove(elem.size()-1); // T: O(1)
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> elem = new ArrayList<>();
        combSum(candidates, target, 0, elem, result);
        return result;
    }
    public static void main(String[] args) {
        int[] candidates={1,2};
        int target=2;
        List<List<Integer>> result= combinationSum(candidates,target);
        int i=0;
        for (List<Integer> rs: result) {
            for (Integer r:rs){
                System.out.println("第"+i+"组"+r);
            }
            i++;
        }

    }
}
