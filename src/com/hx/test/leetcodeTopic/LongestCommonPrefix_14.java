package com.hx.test.leetcodeTopic;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        //判断输入为空，长度为空，首子串为空
        if (strs==null||strs.length==0||strs[0].length()==0) {return "";}
        int index=0;
        //遍历索引
        while (true){
            if (!isSameIndex(strs,index)){ break;}
            index++;
        }
        return strs[0].substring(0,index);
    }
    public boolean isSameIndex(String[] strs,int index){
        //当索引超出首子串时，返回false
        if (strs==null||strs.length==0||strs[0].length()==0||index>=strs[0].length()) return false;
        boolean result=true;
        char cur=strs[0].charAt(index);
        for (int i=0;i<strs.length;i++){
            //当索引超过任何一个子串时，返回false
            if (index>=strs[i].length()){
                result= false;
                break;
            }
            //当首子串当前字母不等一任何一个索引的当前位置字母时，返回false
            if (cur!=strs[i].charAt(index)){
                result= false;
                break;
            }
        }
        return result;
    }
}
