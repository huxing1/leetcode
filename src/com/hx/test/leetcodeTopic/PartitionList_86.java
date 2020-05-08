package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 86. 分隔链表
 * 参考：https://leetcode-cn.com/problems/partition-list/solution/javaliang-lian-biao-pin-jie-100-by-connors-tomatod/
 * @author: hux
 * @create: 2020-04-07 16:42
 **/
public class PartitionList_86 {


    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode minLink=new ListNode(0);
        ListNode minP=minLink;

        ListNode maxLink=new ListNode(0);
        ListNode maxP=maxLink;

        while (head!=null){
            if (head.val<x){
                minP.next=head;
                minP=head;
            }else {
                maxP.next=head;
                maxP=head;
            }
            head=head.next;
        }
        maxP.next=null;
        minP.next=maxLink.next;
        return minLink.next;
    }
}
