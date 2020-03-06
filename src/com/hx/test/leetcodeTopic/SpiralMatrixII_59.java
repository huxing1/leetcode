package com.hx.test.leetcodeTopic;

import java.util.List;

/**
 * @author
 * @description 59. 螺旋矩阵 II
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 *
 * 示例:
 *
 * 输入: 3
 * 输出:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 * @date
 */
public class SpiralMatrixII_59 {
    private static int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int num=1,j=0;
        while (num<=n*n){
            for (int i=j;i<n-j;i++){
                arr[j][i]=num++;
            }

            for (int i=j+1;i<n-j;i++){
                arr[i][n-j-1]=num++;
            }

            for (int i=n-j-2;i>=j;i--){
                arr[n-j-1][i]=num++;
            }

            for (int i=n-j-2;i>j;i--){
                arr[i][j]=num++;
            }

            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix=generateMatrix(3);
        for (int[] nums:matrix) {
            for (int num:nums) {
                if (num>9) {
                    System.out.print(num + " ");
                }else System.out.print(num+"  ");
            }
            System.out.println();
        }
    }
}
