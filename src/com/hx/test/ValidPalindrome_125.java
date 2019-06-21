package com.hx.test;

public class ValidPalindrome_125 {
    private boolean isAlphanumeric(char c){
        return ((c>='a'&& c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'));
    }
    private boolean isEqualIgnoreCase(char a,char b){
        //小写字母a比大写字母A大32
        if (a>='A'&& a<='Z') a+=32;
        if (b>='A'&& b<='Z') b+=32;
        return a==b;
    }
    public boolean isPalindrome(String s){
        if (s==null||s.length()==0) return true;
        int i=0,j=s.length()-1;
        for (;i<j;++i,--j){
            //判断游标i,j是否为字符或数字，charAt(i)取i位置的字符，放在for循环里，把字符串遍历，取每个字符
            while (i<j&&!isAlphanumeric(s.charAt(i))) ++i;
            while (i<j&&!isAlphanumeric(s.charAt(j))) ++j;
            //判断每对i,j游标是否相等
            if (i<j&&!isEqualIgnoreCase(s.charAt(i),s.charAt(j))){
                return false;
            }

        }
        return true;

    }
}
