package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 83. 删除排序链表中的重复元素
 * @date
 */
public class RemoveDuplicatesFromSortedList_83 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    //TODO 链表也不是很懂
    public static void main(String[] args) {
        ListNode head=null;
        ListNode tail=null;
        for (int i=1;i<=4;++i){
            int n=0;
            if (i==1||i==2) n=2;
            else n=i;
            ListNode node=new ListNode(n);
            if (head==null){
                head=node;
                tail=node;
            }else {
                tail.next=node;
                tail=node;
            }
        }

        head= deleteDuplicates(head);
        while (head!=null){
            System.out.print(head.val+"");
            head=head.next;
        }
    }
}
