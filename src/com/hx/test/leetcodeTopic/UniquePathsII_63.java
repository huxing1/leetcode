package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description Unique Paths II
 * 完全不用考虑障碍物后面为0的情况，因为它压根走不到
 * @date
 */
public class UniquePathsII_63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
       int m=obstacleGrid.length,n=obstacleGrid[0].length;
       int[][] d=new int[m][n];
       d[0][0]=obstacleGrid[0][0]==1?0:1;
       for (int i=1;i<m;i++) d[i][0]=obstacleGrid[i][0]==1?0:d[i-1][0];
       for (int i=1;i<n;i++) d[0][i]=obstacleGrid[0][i]==1?0:d[0][i-1];

       for (int i=1;i<m;i++){
           for (int j=1;j<n;j++){
               d[i][j]=obstacleGrid[i][j]==1?0:d[i-1][j]+d[i][j-1];
           }
       }
       return d[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] a={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(a));
    }

}
