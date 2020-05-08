package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 92. 反转链表 II
 * @author: hux
 * @create: 2020-04-13 18:13
 **/
public class ReverseLinkedListII_92 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead=new ListNode(0);
        dummyHead.next=head;

        ListNode p=dummyHead;
        ListNode q=dummyHead.next;

        int step=0;
        while (step<m-1){
            p=p.next;
            q=q.next;
            step++;
        }
        for (int i=0;i<n-m;i++){
            ListNode removed=q.next;
            q.next=q.next.next;

            removed.next=p.next;
            p.next=removed;
        }
        return dummyHead.next;
    }


    /**
    * @Description: 向单链表中写入数据
    * @Param:
    * @return:
    * @Author: hux
    * @Date: 2020/4/20
    */
    static  ListNode head = null;
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

        addNode(3);
        addNode(2);
        addNode(0);
        addNode(-4);

        reverseBetween(head,2,4);


    }

}
