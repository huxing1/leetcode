package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 147. 对链表进行插入排序
 * @author: hux
 * @create: 2020-05-08 16:34
 **/
public class InsertionSortList_147 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode pre = head;
        ListNode cur = head.next;
        dummy.next = head;
        while (cur != null) {
            if (pre.val <= cur.val) {// 本来就有序
                pre = cur;
                cur = cur.next;
            } else {
                ListNode p = dummy;
                // 找到一个位置使得p < cur < p.next
                while (p.next != cur && p.next.val < cur.val) {
                    p = p.next;
                }
                // 这里的操作顺序不能乱
                // 原则是：修改发生在赋值之后
                // 将cur插入到p和p.next之间
                ListNode next = p.next;
                // 因为cur被插到前面，pre的指针需要跳过cur
                pre.next = cur.next;
                cur.next = next;
                p.next = cur;
                // 完成插入后，cur回到pre后面
                cur = pre.next;

            }
        }
        return dummy.next;
    }

    static ListNode head = null;

    public static void addNode(int d) {
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

        addNode(4);
        addNode(2);
        addNode(1);
        addNode(3);
        insertionSortList(head);
        System.out.println("ok");
    }
}
