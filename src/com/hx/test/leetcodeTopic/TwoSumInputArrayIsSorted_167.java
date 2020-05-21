package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 167. 两数之和 II - 输入有序数组
 * @author: hux
 * @create: 2020-05-13 10:50
 **/
public class TwoSumInputArrayIsSorted_167 {
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length==0||numbers==null) return null;
        int[] results = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length-1; j > i; j--) {
                int result = numbers[i] + numbers[j];
                if (result == target) {
                    results[0] = i+1;
                    results[1] = j+1;
                    return results;
                }
            }
        }
        return null;
    }
    /**
    * @Description: 时间复杂度比较小的方法
    * @Param: [numbers, target]
    * @return: int[]
    * @Author: hux
    * @Date: 2020/5/13
    */
    public static int[] twoSum2(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while (i<j){
            if (numbers[i]+numbers[j]>target) j--;
            else if (numbers[i]+numbers[j]<target) i++;
            else return new int[]{i+1,j+1};
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] results = {};
        int target =100;
        int[] result = twoSum2(results, target);
        System.out.println("OK");
    }
}
