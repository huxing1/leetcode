package com.hx.test;

//合并两个有序链表
public class MergeTwoSortedLists_21 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  //灰常简单，就是我不会写test代码..这个链表数据怎么测？
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode p=dummy;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                p.next=l1;
                l1=l1.next;
            }else {
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        if (l1!=null) p.next=l1;
        if (l2!=null) p.next=l2;
        return dummy.next;
    }
}
