package com.hx.test;

/**
* @Author huxing
* @Description 和21题的解法类似，贪心算法
* @Date 15:28 2019/7/19
* @Param
* @return
**/
public class MergekSortedLists_23 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
//TODO 这个题目还有俩种解题方法，比如有限队列，分而治之等，暂时没有写，留给后期刷到类似题型再回来写
    private ListNode mergeSort(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (l1 != null && l2 != null)
        {
            if (l1.val < l2.val)
            {
                p.next = l1;
                l1 = l1.next;
            }
            else
            {
                p.next = l2;
                l2 = l2.next;
            }
            p=p.next;
        }
        if (l1.next!=null) p.next=l1;
        if (l2.next!=null) p.next=l2;
        return dummy.next;
    }

    public ListNode mergeSortedLists(ListNode[] lists) {
        ListNode result = null;
        if (lists == null || lists.length == 0)
        {
            return null;
        }
        for (ListNode list : lists)
        {
            result=mergeSort(result, list);
        }
        return result;
    }
}
