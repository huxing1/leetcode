package com.hx.test;

public class IntegerToRoman_12 {
    public String intToRoman(int num) {
        int[] number = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        String code = "";
        while (num > 0)
        {
            for (int i = 0; i < number.length; i++)
            {
                if ((i + 1) <= number.length - 1 && num >= number[i + 1])
                {
                    continue;
                }
                else
                {
                    num -= number[i];
                    code += roman[i];
                    //得出一个罗马字符之后，将相关数字减掉，然后返回num,直到num<=0
                    break;
                }
            }
        }
        return code;
    }
}
