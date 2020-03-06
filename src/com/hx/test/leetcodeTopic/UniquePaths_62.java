package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 62. 不同路径
 *
 * @date
 */
public class UniquePaths_62 {
    public static int uniquePaths1(int m, int n) {
        if (m<1||n<1)return 0;
        int[][] results=new int[m][n];
        for (int i=0;i<m;i++){
            results[i][0]=1;
        }
        for (int i=0;i<n;i++){
            results[0][i]=1;
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                results[i][j]=results[i-1][j]+results[i][j-1];
            }
        }
        return results[m-1][n-1];

    }
    public static int uniquePaths(int m, int n) {

        if (m<1||n<1) return 0;
        int total=m+n-2;
        int min=Math.min(m-1,n-1);
        //要用long替代int
        long result=1;
        for (int i=0;i<min;i++){
            result=result*(total-i)/(i+1);
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
}
