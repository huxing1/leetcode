package com.hx.test.leetcodeTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @description 54. 螺旋矩阵
 * @date
 */
public class SpiralMatrix_54 {
    private static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix==null||matrix.length==0
        ||matrix[0]==null||matrix[0].length==0)return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        while (true){
            for (int i=left;i<=right;++i) list.add(matrix[top][i]);
            //注意if判断在for循环的外面
            if (++top>bottom) break;

            for (int i=top;i<=bottom;++i) list.add(matrix[i][right]);
            if (--right<left) break;

            for (int i=right;i>=left;--i) list.add(matrix[bottom][i]);
            if (--bottom<top) break;

            for (int i=bottom;i>=top;--i) list.add(matrix[i][left]);
            if (++left>right) break;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list=spiralOrder(matrix);
        for (Integer i:list) {
            System.out.println(i);
        }

    }
}
