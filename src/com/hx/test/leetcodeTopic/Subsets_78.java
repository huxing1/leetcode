package com.hx.test.leetcodeTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @description 78. 子集
 * @date
 */
public class Subsets_78 {
    public static List<List<Integer>> subsets(int[] nums,int start,
                                              List<Integer> elem,List<List<Integer>> result){
        int length=nums.length;
        result.add(new ArrayList<>(elem));
        for (int i=start;i<length;i++){
            elem.add(nums[i]);
            subsets(nums,i+1,elem,result);
            elem.remove(elem.size()-1);
        }
        return result;
    }


    public static List<List<Integer>> subsetsRecursive(int[] nums) {

        if (nums.length==0||nums==null) return new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> elem=new ArrayList<>();
        int start=0;
        subsets(nums,start,elem,result);
        return result;
    }

    public static void main(String[] args) {

        int[] nums={1,2,3};
        List<List<Integer>> lists=subsetsRecursive(nums);
        System.out.println(" ok ");
    }
}
