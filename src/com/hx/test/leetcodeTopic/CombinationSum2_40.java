package com.hx.test.leetcodeTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: leetcode
 * @description: 组合总和 II
 * @author: hux
 * @create: 2020-01-17 17:41
 **/
public class CombinationSum2_40 {

    private static void resolve(int[] candidates, int target, List<Integer> elem, List<List<Integer>> result, int start) {
        Arrays.sort(candidates);

        if (target == 0) {
            result.add(new ArrayList<>(elem));
            return;
        }
        if (target < 0) return;
        for (int i = start; i < candidates.length; i++) {
            if (i != start && candidates[i] == candidates[i - 1]) continue;
            elem.add(candidates[i]);
            resolve(candidates, target - candidates[i], elem, result, i+1);
            elem.remove(elem.size()-1);
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result =new ArrayList<>();
        List<Integer> elem=new ArrayList<>();
        int start=0;
        resolve(candidates,target,elem,result,start);
        return result;
    }

    public static void main(String[] args) {
        int[] candidates = {2, 5, 2, 1, 2};
        int target = 5;
        List<List<Integer>> result= combinationSum2(candidates, target);
        int i=0;
        for ( List<Integer> rs:result ) {
            for (Integer r:rs){
                System.out.println("第"+i+"组是："+r);
            }
            i++;
        }
    }
}
