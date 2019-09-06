package com.hx.test.leetcodeTopic;

import java.util.Stack;



public class ValidParentheses_20 {

    public static void main(String[] args) {
        String s="(()";
        System.out.println(ValidParentheses_20.isVaildShort(s));
    }

    //将所有类型的括号的左括号入栈，将出现的右括号与之相比较，
    // 如果出现在栈顶端则出栈，最后栈为空则返回true
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
            for (int i=0;i<s.length();++i){
            if (s.charAt(i)=='[' || s.charAt(i)=='('||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
                //判断右括号如果没有对应的左括号，则返回false
            }else if (stack.empty()){
                return false;
            }else {
                if (s.charAt(i)==')'&& stack.peek()!='(') return false;
                if (s.charAt(i)==']'&&stack.peek()!='[')return false;
                if (s.charAt(i)=='}'&&stack.peek()!='{')return false;
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static boolean isVaildShort(String s){
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();++i){
            if (s.charAt(i)=='(') stack.push(')');
            else if (s.charAt(i)=='[') stack.push(']');
            else if (s.charAt(i)=='{') stack.push('}');
            else if (stack.empty()||s.charAt(i)!=stack.pop()) return false;
        }
        return stack.empty();
    }
}
