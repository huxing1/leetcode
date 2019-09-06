package com.hx.test.leetcodeTopic;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    //方法一： i移动s.length()次，j也只用s.length()次
    // Time: O(n), Space: O(m), m 是字符集大小
    public int lengthOfLongestSubstring2N(String s) {
        int[] counts = new int[256];
        int i = 0, j = 0, max = 0;
        for (; i < s.length(); ++i)
        {
            for (; j < s.length(); ++j)
            {
                //判断j的值是否已经存在在count中，如果存在则终止此次循环
                if (counts[s.charAt(j)] != 0) break;
                //将j所在位置的字母的value加1
                counts[s.charAt(j)] += 1;
            }
            //通过max和j-1相比较，将较大的参数传给max
            max = Math.max(max, j - i);
            //将i所在位置的字母的value减1（就为0）
            counts[s.charAt(i)] -= 1;
        }
        System.out.println(max);
        return max;
    }

    //方法二：滑动窗口，比较机智的方法
    //Time: O(n), Space: O(m)，m 是字符集大小
    public int lengthOfLongestSubstring1N(String s) {
        int[] index = new int[256];
        //将int数组填充为[-1,-1,-1,-1,-1,-1,-1,-1.........]，因为这样可以使得第一个字母所在的下标为0
        Arrays.fill(index,-1);
        int max=0;
        for (int i=0,j=0;j<s.length();++j){
            //将当前i的值和已经存在的j的值作对比，如果j不存在，比如a不存在，则没有通过后面j赋值过，则为初始化值-1，
            // 而i初始化值为0，即i依然为0.
            i=Math.max(index[s.charAt(j)]+1,i);
            max=Math.max(max,j-i+1);
            //将当前j的字母值赋给数组，比如a字母的ASCII值为97，第一次循环后index[97]=0
            index[s.charAt(j)]=j;
        }
        System.out.println(max);
        return max;
    }
}


