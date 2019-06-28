package com.hx.test;

//给定一个字符串，你的任务是计算这个字符串中有多少个回文子串
//和第五题的思路基本一样
public class PalindromicSubstrings_647 {
    public int countSubstrings(String s) {
        int count = 0;
        boolean[][] b = new boolean[s.length()][s.length()];
        if (s == null && s.length() == 0) return count = 0;
        for (int i = s.length() - 1; i >= 0; --i)
        {
            for (int j = i; j < s.length(); ++j)
            {
                if (i == j) b[i][j] = s.charAt(i) == s.charAt(j);
                else if (i + 1 == j)
                {
                    b[i][j] = s.charAt(i) == s.charAt(j);
                }
                else b[i][j] = s.charAt(i) == s.charAt(j) && b[i + 1][j - 1];
                if (b[i][j]) count++;
            }
        }
        System.out.println(count);
        return count;
    }


    int expend(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            --left;
            ++right;
            count++;
        }
        return count;
    }

    //方法二：滑动窗口
    public int countSubstrings2(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            //注意这里每次都只是传过来一个count=1
            count += expend(s, i, i);
            count += expend(s, i, i + 1);
        }
        System.out.println(count);
        return count;
    }
}
