package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 203. 移除链表元素
 * @author: hux
 * @create: 2020-07-20 15:23
 **/
public class RemoveLinkedListElements_206 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode notEqual = dummy;

        while (notEqual.next != null) {
            if (notEqual.next.val == val) notEqual.next = notEqual.next.next;
            else notEqual = notEqual.next;
        }
        return dummy.next;
    }

    static ListNode head = null;

    private static void addNode(int d) {
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

    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        addNode(4);
        addNode(1);
        removeElements(head,1);
        System.out.println("ok");
    }
}
