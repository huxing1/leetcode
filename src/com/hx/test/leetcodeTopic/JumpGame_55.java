package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 55. 跳跃游戏
 * @date
 */
public class JumpGame_55 {
    private static boolean canJump(int[] nums) {
        if (nums.length==0||nums==null) return false;
        int n=nums.length,max=0;
        for (int i=0;i<n ;++i){
            if (max>=n-1) return true;
            //要确保当前指标小于max，即当前指标是可达的
            if (i>max) return false;
            int step=nums[i]+i;
            max=Math.max(step,max);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }

}
