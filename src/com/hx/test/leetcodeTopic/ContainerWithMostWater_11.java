package com.hx.test.leetcodeTopic;

public class ContainerWithMostWater_11 {
    /**
    * @Author huxing
    * @Description 盛最多水的容器
    * @Date 17:56 2019/6/24
    * @Param [height]
    * @return int
    **/
    //双指针，so easy啦
    // Time: O(n), Space: O(1)
    public int maxArea(int[] height){
        int max=0,i=0,j=height.length-1;
        while (i<j){
            int cur=Math.min(height[i],height[j])*(j-i);
            max=Math.max(max,cur);
            if (height[i]<height[j])++i;
            else --j;
        }
        //记得在main函数中对象调用的时候，先创建int[]对象传入数组,再将对象传进去
        return max;
    }
}
