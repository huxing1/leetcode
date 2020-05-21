package com.hx.test.utils;

import com.hx.test.leetcodeTopic.InsertionSortList_147;
import com.hx.test.leetcodeTopic.ReverseLinkedListII_92;

/**
 * @program: leetcode
 * @description:
 * @author: hux
 * @create: 2020-05-08 16:37
 **/
public class ListNodeUtils {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * @Description: 向单链表中写入数据
     * @Param:
     * @return:
     * @Author: hux
     * @Date: 2020/4/20
     */
    ListNode head = null;
    public   void addNode(int d) {
        ListNode newNode = new ListNode(d);// 实例化一个节点
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

//    public static void main(String[] args) {
//
//        addNode(3);
//        addNode(2);
//        addNode(0);
//        addNode(-4);
//
//
//
//    }
}
