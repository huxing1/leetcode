package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 最后一个单词的长度
 * @author: hux
 * @create: 2020-01-22 14:28
 **/
public class LengthOfLastWord_58 {

    public static int lengthOfLastWord2(String s) {
        int count=0;
        String str=s.trim();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' ')
                count++;
            else
                break;
        }
        if(count>str.length())
            return 0;
        else
            return count;

    }
    private static int lengthOfLastWord1(String s) {
        int length=0;
        String str=s.trim();
        for (int i=str.length()-1;i>0;--i){
            if (str.charAt(i)!=' '){
                length++;
            }else if (length!=0){
                return length;
            }
        }
        return length;
    }



    private static int lengthOfLastWord(String s) {
        if (s.isEmpty()) return 0;
        if (!s.isEmpty()&&!s.contains(" ")) return s.length();
        String str = s.substring(s.lastIndexOf(" "));
        int length = str.length() - 1;
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord2("    "));
    }
}
