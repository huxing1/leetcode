package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 75. 颜色分类
 * @date
 */
public class SortColors_75 {
    private static int[] sortColors(int[] nums) {
        //双指针

        int low=0,high=nums.length-1;
        int i=0;
        while (i<=high){
            if (nums[i]==0){
                int tmp=nums[i];
                nums[i]=nums[low];
                nums[low]=tmp;
                low++;i++;
            }else if(nums[i]==1){
                i++;
            }else if (nums[i]==2){
                int tmp=nums[i];
                nums[i]=nums[high];
                nums[high]=tmp;
                high--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] num={1,0,2,1,2};
        int[] result=sortColors(sortColors(num));
        for (int i:result) {
            System.out.println(i);
        }

    }
}
