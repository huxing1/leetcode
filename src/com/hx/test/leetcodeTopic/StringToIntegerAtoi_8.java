package com.hx.test.leetcodeTopic;

public class StringToIntegerAtoi_8 {
    // 一个可以有效地转成数字的字符串包含以下特点：
    // 1. 可以有前导空格或前导 0，但不能有其它前导字符
    // 2. 可能会有一个加号或减号表示正负，也可能没有，连续的多个加号或减号则视为不合法
    // 3. 紧接着是一段连续的数字，如果没有数字则示为不合法
    // 4. 数字后的其它字符都可以忽略
    // 5. 如果数字大于 int 的最大值或小于 int 的最小值，返回相应的极值即可
    // 6. 字符串如果不能合法地转为整数，则返回 0
    public int string2Integer(String str) {
        int start = 0, p = 0, n = str.length();
        boolean negative = false;
        //忽略掉字符串的前导空格
        while (p < n && str.charAt(p) == ' ') ++p;
        //如果p=n说明这个字符串全是空格
        if (p == n) return 0;
        //判断字符串是否为负数
        if (str.charAt(p) == '+')
        {
            ++p;
        }
        else if (str.charAt(p) == '-')
        {
            ++p;
            negative = true;
        }

        //忽略掉前导0
        while (p < n && str.charAt(p) == '0') ++p;
        start = p;

        //p扫过所有的数字部分
        while (p < n && str.charAt(p) >= '0' && str.charAt(p) <= '9') ++p;
        //如果p还在start位置
        if (p == start) return 0;
        //判断是否越界
        if (p - start > 10)
        {
            if (negative) return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }

        long num = 0;
        //注意i是小于p的！！
        for (int i = start; i < p; ++i)
        {
            //str.charAt(i)-'0'可以得到数字 ascii值确定的
            num = num * 10 + (str.charAt(i) - '0');
        }
        //判断是否为负数并返回
        num = negative ? -num : num;

        if (num < Integer.MIN_VALUE){System.out.println(Integer.MIN_VALUE); return Integer.MIN_VALUE;}
        else if (num > Integer.MAX_VALUE) {System.out.println(Integer.MAX_VALUE);return Integer.MAX_VALUE;}
        else System.out.println(num);return (int) num;
    }
}
