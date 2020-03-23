package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 85. 最大矩形
 * @date
 */
public class MaximalRectangle_85 {
    private static int largestRectangleInHistogram(int[] heights) {
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
    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0
                || matrix[0] == null || matrix[0].length == 0)
            return 0;
        int m = matrix.length, n = matrix[0].length;
        int[] heights = new int[n];
        int max = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                heights[j] = matrix[i][j] == '1' ? heights[j]+1 : 0;
            }
            max = Math.max(max, largestRectangleInHistogram(heights));
        }
        return max;
    }

    public static void main(String[] args) {
        char[][] matrix={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix));
    }
}
