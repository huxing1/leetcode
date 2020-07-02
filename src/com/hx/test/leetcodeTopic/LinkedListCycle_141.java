package com.hx.test.leetcodeTopic;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetcode
 * @description: 141. 环形链表
 * @author: hux
 * @create: 2020-06-03 19:47
 **/
public class LinkedListCycle_141 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
    * @Description: 通过辅助Set来判断是否有环
    * @Param: [head]
    * @return: boolean
    * @Author: hux
    * @Date: 2020/6/3
    */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        for (ListNode p=head;p!=null;p=p.next){
            if (set.contains(p)) return true;
            set.add(p);
        }
        return false;
    }
    /**
     * @Description: 通过快慢指针是否相等来判断是否有环
     * @Param: [head]
     * @return: boolean
     * @Author: hux
     * @Date: 2020/6/3
     */
    public boolean hasCycleWithTwoPoint(ListNode head) {
        ListNode fast=head,slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow) return true;
        }
        return false;
    }
}
