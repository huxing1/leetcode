package com.hx.test;


public class SwapNodesinPairs_24 {
    public static  class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode head=null;
        ListNode tail=null;
        for (int i=1;i<=4;++i){
            ListNode node=new ListNode(i);
            if (head==null){
                head=node;
                tail=node;
            }else {
                tail.next=node;
                tail=node;
            }
        }

        head= swapPairs(head);
        while (head!=null){
            System.out.print(head.val+"");
            head=head.next;
        }
    }

    //采用递归的解法，递归算法可参考http://lylblog.cn/blog/4#comment-container
    /**
     *功能描述
     * @Author huxing
     * @Description 两两交换链表中的节点
     * @Date 2019-07-28
     * @param head
     * @return
    **/
    public static ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
        head.next=swapPairs(next.next);
        next.next=head;

        return next;
    }
}
