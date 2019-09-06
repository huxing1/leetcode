package com.hx.test.leetcodeTopic;

public class ReverseNodesInkGroup_25 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode head = null;
        ListNode tail = null;
        for (int i = 1; i <= 2; ++i)
        {
            ListNode node = new ListNode(i);
            if (head == null)
            {
                head = node;
                tail = node;
            }
            else
            {
                tail.next = node;
                tail = node;
            }
        }

        head = reverseKGroup(head, 3);
        while (head != null)
        {
            System.out.print(head.val + "");
            head = head.next;
        }
    }

    /**
    * @Author huxing
    * @Description  K 个一组翻转链表
    * @Date 13:51 2019/7/29
    * @Param [head, k]
    * @return com.hx.test.leetcodeTopic.ReverseNodesInkGroup_25.ListNode
    **/
    public static ListNode reverseKGroup(ListNode head, int k) {
        int i=k;
        ListNode[] stack=new ListNode[i];
        ListNode q=head;
        //把本次递归要循环的链表值以后的链表存在q中
        while (k>0){
            stack[i-k]=q;
            if (q!=null)  q=q.next;
            //节点如果不足k个，则返回head
            else return head;
            k--;
        }
        //将本次循环的值交换位置
        while (k<i-1){
            ++k;
            stack[i-k].next=stack[i-k-1];
        }
        //将本次递归要循环的链表和 本次不需要循环的链表连接起来
        stack[0].next=reverseKGroup(q,k+1);
        //返回链表
        return stack[i-1];
    }

}
