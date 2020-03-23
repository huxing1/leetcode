package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 84. 柱状图中最大的矩形
 * @date
 */
public class LargestRectangleInHistogram_84 {
    private static int largestRectangleArea(int[] heights) {
        if (heights.length==0||heights==null) return 0;
        int max=0,n=heights.length;
        for (int i=0;i<n;++i){
            int l=i,r=i;
            while (l>=0&&heights[l]>=heights[i])
                --l;
            while (r<n&&heights[r]>=heights[i])
                ++r;
            max=Math.max(max,heights[i]*(r-l-1));
        }

        return max;
    }

    public static void main(String[] args) {
        int[] heights={2,1,3,4,1};
        System.out.println(largestRectangleArea(heights));
    }
}
