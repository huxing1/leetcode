package com.hx.test.leetcodeTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: 60. 第k个排列
 * @author: hux
 * @create: 2020-03-26 17:00
 **/
public class PermutationSequence_60 {
//    private static List<List<Integer>> results= new ArrayList<>();
//    private static List<List<Integer>> backTrace(int n,int index,List<Integer> tmp){
//        if (tmp.size()==n){
//            results.add(tmp);
//            return results;
//        }
//        for (int i=1;i<=3;i++) {
//            tmp.add(index);
//            backTrace(n, index+1, tmp);
//            tmp.remove(tmp.size() - 1);
//        }
//        return results;
//    }
//
//    private static String getPermutation(int n, int k) {
//        List<List<Integer>> results= backTrace(n,1,new ArrayList<>(n));
//        List<Integer> list= results.get(k-1);
//        String result="";
//        for (Integer i:list) {
//            result=result+i.toString();
//        }
//        return result;
//    }

    private static int index = 0;
    private static StringBuilder sb = new StringBuilder();
    private static int[] base;
    public static String getPermutation(int n, int k) {
        base = new int[n];
        for (int i = 0; i < n; i++) {
            base[i] = i+1;
        }
        backtrack(k,n);
        return sb.toString();
    }
    private static void backtrack(int n, int k){
        if (sb.length()==n){
            index++;
        }
        for (int i = 0; i < n; i++) {
            if (base[i]!=-1) {
                sb.append(base[i]);
                base[i] = -1;
                backtrack(k, n);
                if (index>=k) return;
                sb.deleteCharAt(sb.length()-1);
                base[i] = i+1;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(getPermutation(3,3));
    }
}
