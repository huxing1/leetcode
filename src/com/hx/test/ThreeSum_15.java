package com.hx.test;

//public class ThreeSum {
//    public static void main(String[] args){
//        System.out.println("hello world");
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new LinkedList<>();
        if(nums!=null&&nums.length>2){
            Arrays.sort(nums);
            for(int i=0;i<nums.length-2; ){

                int j=i+1;
                int k= nums.length-1;
                while(j<k){
                    if (nums[j]+nums[k]==-nums[i]) {
                        List<Integer> list = new ArrayList<>(3);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        result.add(list);

                        k--;
                        j++;
                        //下面while中继续进行-- ++的目的是为了去重
                        while (k > j && nums[k] == nums[k + 1]) {
                            k--;
                        }
                        while (k > j && nums[j] == nums[j - 1]) {
                            j++;
                        }
                    }

                    else if (nums[j]+nums[k]<-nums[i]){
                        j++;
                        while (k>j&&nums[j]==nums[j-1]){
                            j++;
                        }
                    }
                    else{
                        k--;
                        while (k>j&&nums[k]==nums[k+1]){
                            k--;
                        }
                    }


                }
                i++;
                while(i<nums.length-2&&nums[i]==nums[i-1]){
                    i++;
                }

            }
        }
        return result;
    }
}

