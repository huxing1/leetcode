package com.hx.test.leetcodeTopic;

import java.util.Stack;

/**
 * @program: leetcode
 * @description: 100. 相同的树
 * @author: hux
 * @create: 2020-05-21 17:59
 **/
public class SameTree_100 {
    private static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 /**
 * @Description: method 1
 * @Param: [p, q]
 * @return: boolean
 * @Author: hux
 * @Date: 2020/5/21
 */
    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null) return true;
        if (p==null||q==null) return false;
        return p.val==q.val &&
              isSameTree(p.left,q.left)&&
              isSameTree(p.right,q.right);
    }
    /**
     * @Description: method 2
     * @Param: [p, q]
     * @return: boolean
     * @Author: hux
     * @Date: 2020/5/21
     */
    private static boolean isSameTree2(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack =new Stack<>();
        stack.push(p);stack.push(q);
        while (!stack.empty()){
            TreeNode s=stack.pop();
            TreeNode t=stack.pop();
            if (s==null&&t==null) continue;
            if (s==null||t==null) return false;
            if (s.val!=t.val) return false;
            stack.push(s.left);
            stack.push(t.left);
            stack.push(s.right);
            stack.push(t.right);
        }
        return true;
    }

    public static void main(String[] args) {
       TreeNode[] p=new TreeNode[3];
        p[0] = new TreeNode(1);
        p[1] = new TreeNode(2);
        p[2] = new TreeNode(3);

        TreeNode[] q=new TreeNode[3];
        q[0] = new TreeNode(1);
        q[1] = new TreeNode(2);
        q[2] = new TreeNode(2);

        TreeNode node1 = null;
        node1=p[0];
        node1.left=p[1];
        node1.right=p[2];

        TreeNode node2 = null;
        node2=q[0];
        node2.left=q[1];
        node2.right=q[2];

        System.out.println(isSameTree2(node1,node2));
    }
}
