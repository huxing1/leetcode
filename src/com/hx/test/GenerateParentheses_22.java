package com.hx.test;

import java.util.ArrayList;
import java.util.List;

/**
* @Author huxing
* @Description 括号生成
* @Date 11:23 2019/7/18
* @Param
* @return
**/
public class GenerateParentheses_22 {
    private void generate(List<String> result,String str,int left,int right){
        if (left==0&&right==0){
            result.add(str);
        }
        //这里挺有意思，调用当前方法需要注意，每一轮调用完毕则返回上一层最后一次调用的前一次的的参数，直至调用结束
        if (left!=0)generate(result,str+"(",left-1,right);
        if (right>left)generate(result,str+")",left,right-1);

    }
/**
* @Author huxing
* @Description 这个方法只需要注意俩点即可 1，左括号随时可以添加 2，右括号只有在比左括号多的时候才可以添加
* @Date 11:21 2019/7/18
* @Param [n]
* @return java.util.List<java.lang.String>
**/
    public List<String> generateParenthesis(int n) {
        if (n<=0)return new ArrayList<>();
        List<String> result=new ArrayList<>();
        generate(result,"",n,n);
        return result;
    }

//    还有一种动态分配的方法，暂时没有写，因为段时间内对我来说有点复杂，实在是没有看懂 (ಥ_ಥ)
}
