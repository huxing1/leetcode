package com.hx.test.leetcodeTopic;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description: 57. 插入区间 (与56题基本差不多)
 * 分成三块：比newInterval[0]小的，与newInterval有交叉的，比newInterval[0]大的
 *
 * @author: hux
 * @create: 2020-05-07 17:34
 **/
public class InsertInterval_57 {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int lenght= intervals.length;
        int[][] tmp=new int[lenght+1][2];
        int size=0,p=0;
        for (;p<intervals.length&&intervals[p][0]<newInterval[0];++p){
            tmp[size++]=intervals[p];
        }
        if (size==0||tmp[size-1][1]<newInterval[0]){   //表示没有重叠，直接追加
            tmp[size++]=newInterval;
        }else {
            tmp[size-1][1]=Math.max(tmp[size-1][1],newInterval[1]);
        }

        for (;p<intervals.length;++p){
            if (tmp[size-1][1]<intervals[p][0]){    //表示没有重叠，直接追加
                tmp[size++]=intervals[p];
            }else {
                tmp[size-1][1]=Math.max(tmp[size-1][1],intervals[p][1]);
            }
        }
        return Arrays.copyOf(tmp,size);
    }

    public static void main(String[] args) {
        int[] a={1,7};
        int[] b={2,9};
        int[] c={10,12};
        int[] d={2,8};
        int[][] lo={a,b,c};
        int[][] re=insert(lo,b);
        for (int[] l:re) {
            for (int num: l) {
                System.out.println(num+"");
            }
            System.out.println();

        }
    }
}
