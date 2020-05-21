package com.hx.test.leetcodeTopic;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetcode
 * @description: 136. 只出现一次的数字
 * @author: hux
 * @create: 2020-05-18 16:19
 **/
public class SingleNumber_136 {
    /**
    * @Description: 异或 位运算
    * @Param: [nums]
    * @return: int
    * @Author: hux
    * @Date: 2020/5/18
    */
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num: nums)
            result ^= num;
        return result;
    }

    public static int singleNumber1(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int sum=0,uniqueSum=0;
        for (int num:nums){
            if (!set.contains(num)){
                uniqueSum +=num;
                set.add(num);
            }
            sum +=num;
        }
        return 2*uniqueSum-sum;
    }

    public static void main(String[] args) {
        int[] nums={5,7,5,6,6};
        System.out.println(singleNumber1(nums));
        System.out.println("ok");
    }
}
