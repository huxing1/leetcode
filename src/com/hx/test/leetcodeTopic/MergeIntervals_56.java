package com.hx.test.leetcodeTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author
 * @description 56. 合并区间
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 1:
 *
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * @date
 */
public class MergeIntervals_56 {
    private static int[][] merge(int[][] intervals) {

        int[][] result=new int[intervals.length][2];
        int size=0;
        //按int[][] left位置进行排序
        // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int[] in : intervals) {
            //判断result[size-1][1]
            if (size==0||result[size-1][1]<in[0]){
                result[size][0]=in[0];
                result[size][1]=in[1];
                ++size;
            }else {
                result[size-1][1]=Math.max(result[size-1][1],in[1]);
            }
        }
        //去掉多余的数据[][size],只保留size个[]
        return Arrays.copyOf(result,size);

    }

    public static void main(String[] args) {
        int[] a={1,7};
        int[] b={2,8};
        int[] c={10,12};
        int[] d={9,11};
        int[][] lo={a,b,c,d};
        int[][] re=merge(lo);
        for (int[] l:re) {
            for (int num: l) {
                System.out.println(num+"");
            }
            System.out.println();

        }

    }
}
