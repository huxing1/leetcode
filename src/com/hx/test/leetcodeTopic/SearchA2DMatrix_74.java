package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 74. 搜索二维矩阵
 * @date
 */
public class SearchA2DMatrix_74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int row = 0, col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] < target)
                row++;
            else if(matrix[row][col] > target)
                col--;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6}};
        int target=1;
        System.out.println(searchMatrix(matrix,target));
    }
}
