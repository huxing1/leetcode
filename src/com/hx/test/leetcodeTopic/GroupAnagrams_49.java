package com.hx.test.leetcodeTopic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author huxing
 * @Description 49. 字母异位词分组
 * @Date 2020-02-11
 * @param
 * @return
**/
public class GroupAnagrams_49 {
    private static String strSort(String s){
        char[] c= s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0||strs==null) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s:strs) {
            String key=strSort(s);
            //putIfAbsent:如果key不存在则add key进去
            map.putIfAbsent(key,new ArrayList<>());
            //向key对应的map中添加value
            map.get(key).add(s);
        }
        return new  ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs={"eat", "tea", "ten", "ate", "net"};
        System.out.println(groupAnagrams(strs));
    }
}
