package com.hx.test.leetcodeTopic;

public class ImplementStr_28 {
    public static void main(String[] args) {
        System.out.println(strStr("aaa", ""));
    }

    public static int strStr(String haystack, String needle) {

        if (needle==null||haystack==null) return -1;
        if (needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); ++i)
        {

            if (haystack.charAt(i) == needle.charAt(0))
            {
                String subStr = haystack.substring(i, i + needle.length());
                if (subStr.equals(needle))
                {
                    return i;
                }
            }
        }
        return -1;


    }

    public static int subTest(String str, String result) {
        String subStr = str.substring(3, 5);
        if (subStr.equals(result))
        {
            return 2;
        }
        return -1;
    }
}
