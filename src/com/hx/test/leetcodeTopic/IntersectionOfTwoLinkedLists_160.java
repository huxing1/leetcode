package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 160. 相交链表
 * @author: hux
 * @create: 2020-06-11 16:58
 **/
public class IntersectionOfTwoLinkedLists_160 {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = 0, lenB = 0;
        for (ListNode p = headA; p != null; p = p.next, ++lenA) ;
        for (ListNode p = headB; p != null; p = p.next, ++lenB) ;
        ListNode p = headA, q = headB;
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; ++i)
                p = p.next;
        } else {
            for (int i = 0; i < lenB - lenA; ++i)
                q = q.next;
        }
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
