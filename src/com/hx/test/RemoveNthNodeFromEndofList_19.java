package com.hx.test;
/**
* @Author huxing
* @Description 删除链表的倒数第N个节点
* @Date 20:27 2019/7/8
* @Param ListNode head, int n
* @return ListNode
**/
public class RemoveNthNodeFromEndofList_19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
//这个算法很有意思，给定dummy节点指向头结点，初始化游标p,q指向dummy,
// 先将q移动n个位置（目的是将p,q中间隔开n个位置），若q.next!=null,则p,q同时移动，直到q移动至尾结点，
// 将p指向p的下下个位置，返回dummy.next即可
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode p=dummy,q=dummy;
        for (;n>0;--n){
            q=q.next;
        }
        if (n!=0)return dummy.next;
        while (q.next!=null){
            p=p.next;
            q=q.next;
        }
        p.next=p.next.next;
        return dummy.next;
    }
}
