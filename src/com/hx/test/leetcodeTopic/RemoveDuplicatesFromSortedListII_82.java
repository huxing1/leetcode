package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 82. 删除排序链表中的重复元素 II
 * @author: hux
 * @create: 2020-03-30 17:40
 **/
public class RemoveDuplicatesFromSortedListII_82 {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode current = head.next;
        if (current.val != head.val) {
            head.next = deleteDuplicates(current);
        }
        else {
            while (current != null && head.val == current.val) {
                current = current.next;
            }
            head = deleteDuplicates(current);
        }
        return head;
    }
}
