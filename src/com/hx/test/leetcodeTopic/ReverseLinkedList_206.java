package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 206. 反转链表
 * @author: hux
 * @create: 2020-05-22 15:52
 **/
public class ReverseLinkedList_206 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
    public static ListNode reverseList(ListNode head) {
        ListNode cur=head,pre=null;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return  pre;
    }

    public static void main(String[] args) {
        ListNode head=null;
        ListNode tail=null;
        for (int i=1;i<=5;++i){
            ListNode node=new ListNode(i);
            if (head==null){
                head=node;
                tail=node;
            }else {
                tail.next=node;
                tail=node;
            }
        }

        head= reverseList(head);
        while (head!=null){
            System.out.print(head.val+"");
            head=head.next;
        }
    }
}
