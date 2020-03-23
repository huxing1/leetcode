package com.hx.test.leetcodeTopic;

import java.util.List;

/**
 * @author
 * @description 61. 旋转链表
 * @date
 */
public class RotateList_61 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }
    }
    // Time: O(n), Space: O(1)
    private static ListNode rotateRightToLeft(ListNode head, int k) {
        if (head==null||head.next==null||k<=0)return head;
        ListNode end=head;
        int n=1;
        for (;end.next!=null;end=end.next) {
            ++n;
        }
        end.next=head;
        k%=n;
        ListNode newEnd=head;
        for (int i=0;i<n-k-1;++i) newEnd=newEnd.next;
        ListNode newHead=newEnd.next;
        newEnd.next=null;
        return newHead;

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

        head= rotateRightToLeft(head,6);
        while (head!=null){
            System.out.print(head.val+"");
            head=head.next;
        }
    }
}
