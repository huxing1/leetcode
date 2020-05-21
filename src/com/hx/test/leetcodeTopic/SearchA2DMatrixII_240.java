package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 240. 搜索二维矩阵 II
 * @author: hux
 * @create: 2020-05-20 16:27
 **/
public class SearchA2DMatrixII_240 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
            return false;

        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] > target) --j;
            else if (matrix[i][j] < target) ++i;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        searchMatrix(matrix, 16);
        System.out.println("ok");
    }
}
