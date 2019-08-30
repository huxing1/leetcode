package com.hx.test;

import java.util.Stack;

public class LongestValidParentheses_32 {

//    class Solution {
//        public int longestValidParentheses(String s) {
//            if (s == null || s.length() == 0)
//                return 0;
//            int max = 0;
//
//            Stack<Integer> stack = new Stack<>();
//            stack.push(-1);
//            for(int i = 0; i != s.length(); ++i){
//                if (s.charAt(i) == '('){
//                    stack.push(i);
//                }
//                if (s.charAt(i) == ')'){
//                    stack.pop();
//                    if (stack.isEmpty())
//                        stack.push(i);
//                    else
//                        max = max > i - stack.peek()?max:i - stack.peek();
//                }
//            }
//
//            return max;
//        }
//    }

    public static void main(String[] args) {
        String s=")()())";
        System.out.println(LongestValidParentheses_32.longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        int max=0;
        if (s == null || s.length() == 0) return 0;
        Stack<Integer> stack=new Stack<>();

        stack.push(-1);
        for (int i=0;i<s.length();++i){
            if (s.charAt(i)== '(')  stack.push(i);
            else {
                stack.pop();
                if (stack.empty())  stack.push(i);
                else
                {
                    // stack.peek()的值为-1，所以i - stack.peek()=2
                   max= Math.max(max, (i - stack.peek()));
                }
            }
        }
        return max;
    }
}
