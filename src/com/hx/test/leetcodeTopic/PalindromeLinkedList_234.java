package com.hx.test.leetcodeTopic;

import java.util.Stack;

public class PalindromeLinkedList_234 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // Time: O(n), Space: O(1)
    public boolean isPalindromeReverseList(ListNode head){
        int len=0;
        for (ListNode p=head;p!=null;p=p.next,++len);
            ListNode cur =head;
            ListNode pre=null;
            for (int i=0;i<len/2;i++) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            if (len%2==1) cur=cur.next;
            for (;pre!=null&&cur!=null;cur=cur.next,pre=pre.next){
                if (cur.val!=pre.val){
                    return false;
                }
            }return true;
    }

}












//    public boolean isPalindromeReverseList(ListNode head) {
//        int len = 0;
//        for (ListNode p = head; p != null; p = p.next, ++len);
//
//        // reverse half list
//        ListNode cur = head, pre = null;
//        for (int i = 0; i < len / 2; ++i) {
//            ListNode next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//
//        if (len % 2 == 1) cur = cur.next;
//        for (; pre != null && cur != null; pre = pre.next, cur = cur.next) {
//            if (pre.val != cur.val) return false;
//        }
//        return true;
//    }
//}
