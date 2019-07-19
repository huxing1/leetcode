package com.hx.test;

import java.util.Stack;

public class ValidParentheses_20 {
    //将所有类型的括号的左括号入栈，将出现的右括号与之相比较，
    // 如果出现在栈顶端则出栈，最后栈为空则返回true
    public boolean isValid(String s) {
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

    public boolean isVaildShort(String s){
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
