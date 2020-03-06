package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 64. 最小路径和
 * @date
 */
public class MinimumPathSum_64 {
    public static int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] d=new int[m][n];
        d[0][0]=grid[0][0];
        for (int i=1;i<m;i++) d[i][0]=grid[i][0]+d[i-1][0];
        for (int j=1;j<n;j++) d[0][j]=d[0][j-1]+grid[0][j];

        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                d[i][j]=Math.min(d[i-1][j],d[i][j-1])+grid[i][j];
            }
        }
        return d[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] a={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(a));
    }
}
