package com.hx.test.leetcodeTopic;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description: 169. 多数元素
 * @author: hux
 * @create: 2020-06-02 18:34
 **/
public class MajorityElement_169 {
    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int maxNum=0,maxCount=0;
        for (int num:nums){
          int newCnt=  map.getOrDefault(num,0)+1;
          map.put(num,newCnt);
          if (newCnt>maxCount){
              maxCount=newCnt;
              maxNum=num;
          }
        }
        return maxNum;
    }
    public static int majorityElement1(int[] nums){
        int num=nums[0],count=1;
        for (int i=1;i<nums.length;++i){
            if (count==0){
                num=nums[i];
                count=1;
            }else if (nums[i]==num){
                ++count;
            }else --count;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement1(nums));
    }
}
