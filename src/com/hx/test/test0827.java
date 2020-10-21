package com.hx.test;

import java.text.MessageFormat;

/**
 * @program: leetcode
 * @description:
 * @author: hux
 * @create: 2020-08-27 12:16
 **/
public class test0827 {
    public static void main(String[] args) {
        String s="_ALL";
        //%1$s可以通过一个值来格式化多个占位符
//        System.out.println(String.format("该域名%1$s被访问了%1$s次.", s));

        // %s占位符,输出字符串
        String username = "user1";
        int num = 3;
//        System.out.printf("%s您好,您是第%s位访客\n", username, num);

//        System.out.println(String.format("我是%1$s,我来自%2$s,今年%3$s岁", "中国人", "北京",
//                "22"));

        String baseSql = String.format("SELECT %s,%s FROM %s.NSRSBH", 2,2,3)+"%1$s";
//        System.out.println(String.format(baseSql,"_ALL"));

        String sql="select NSRSBH, DIMENSIONALITY_YEAR from  FBS.NSRSBH_DIMENSIONALITY_YEAR%1$s where (DIMENSIONALITY_YEAR) like '%2017%' ";
//        System.out.println(String.format(sql,"啦啦啦"));
        System.out.println(sql.replace("%1$s",""));

        String sql1="'%2017%'";
//        System.out.println(String.format(sql1));
//        String a=null;
//        if (a!=null) System.out.println(true);
//        else System.out.println(false);



    }

}
