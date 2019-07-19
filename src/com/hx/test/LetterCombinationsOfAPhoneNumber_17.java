package com.hx.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
* @Author huxing
* @Description 电话号码的字母组合
* @Date 20:56 2019/7/2
* @Param String digits
* @return  List<String>
**/
public class LetterCombinationsOfAPhoneNumber_17 {
    private final String[] mapping=new String[]{"abc","def","ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"};
    public void combination(int idx,String digits,String str,List<String> result){
        //当传入的字符长度和已经获取的字符串相等的时候，将字符串添加到结果之中
        if (idx==digits.length()){
            result.add(str);
            //这个return很有意思，返回上次的for循环里面，直到超出for循环的边界
            return;
        }
        //将获取的 例如"23"，idx为0的时候，chars='2'-'2',所以可以找到该数字在mapping中的对应字母
        String chars=mapping[digits.charAt(idx)-'2'];
        //超出边界的话继续上一轮的循环
        for (int i=0;i<chars.length();++i){
            combination(idx+1,digits,str+chars.charAt(i),result);
        }
    }

    public List<String> letterCombinationsRecusive(String digits){
        if (digits==null||digits.length()==0) return Collections.emptyList();
        List<String> result=new ArrayList() ;
        combination(0,digits,"",result);
        return result;
    }
    // Time: O(4^n), Space: O(4^n)
    public List<String> letterCombinationsIterative(String digits) {
        if (digits==null||digits.length()==0) return Collections.emptyList();
        LinkedList<String> result=new LinkedList<>();

        //在列表中加入""空子串
        result.add("");
        //获取输入数字对应的字符串
        for (int i=0;i<digits.length();++i){
            String chars=mapping[digits.charAt(i)-'2'];
            //获取结果的个数，且将结果poll出来（一个），方便与后面子串挨个相加
            int size=result.size();
            //在外面定义size是因为，result.poll一直在改变size
            for (int j=0;j<size;++j){
               String str=result.poll();
               //将当前子串放入列表中
                for (int n=0;n<chars.length();++n){
                    result.add(str+chars.charAt(n));
                }
            }
        }
        return result;
    }
}
