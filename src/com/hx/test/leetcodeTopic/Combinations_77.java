package com.hx.test.leetcodeTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: 77. 组合
 * @author: hux
 * @create: 2020-03-24 17:27
 **/
public class Combinations_77 {
    private static List<List<Integer>> res=new ArrayList<>();
    private static List<List<Integer>> combine(int n, int k) {
        backTrace(n,k,1,new ArrayList<Integer>());
        return res;
    }
    private static void backTrace(int n,int k,int index,List<Integer> tmp){
        if (tmp.size()==k){
            res.add(new ArrayList<Integer>(tmp));
            return;
        }
        if (index<=n){
            tmp.add(index);
            backTrace(n,k,index+1,tmp);
            tmp.remove(tmp.size()-1);
            backTrace(n,k,index+1,tmp);
        }
    }

    public static void main(String[] args) {
        combine(4,2);
        System.out.println("执行完成");
    }
}
