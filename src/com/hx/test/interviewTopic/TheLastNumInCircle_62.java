package com.hx.test.interviewTopic;

/**
 * @program: leetcode
 * @description: 面试题62. 圆圈中最后剩下的数字
 * 参考：https://blog.csdn.net/u011500062/article/details/72855826
 * @author: hux
 * @create: 2020-03-31 10:53
 **/
public class TheLastNumInCircle_62 {
    public int lastRemaining(int n, int m) {
        int p=0;
        for(int i=2;i<=n;i++)
        {
            p=(p+m)%i;
        }
        return p;
    }
}
