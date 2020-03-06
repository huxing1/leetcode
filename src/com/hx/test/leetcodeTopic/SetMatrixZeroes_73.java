package com.hx.test.leetcodeTopic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author
 * @description 73. 矩阵置零
 * @date
 */
public class SetMatrixZeroes_73 {
    public static void  setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (matrix[i][j] == 0)
                    rows[i] = cols[j] = true;

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (rows[i] || cols[j])
                    matrix[i][j] = 0;
    }

    public static void main(String[] args) {
        int[][] a={{1,0,3},{1,2,3}};
//        System.out.println(a[0][1]);
//        Map<Integer,Integer> map=new HashMap<>();
//        map.put(1,1);
//        System.out.println(map.get(0));
        setZeroes(a);

    }
}
