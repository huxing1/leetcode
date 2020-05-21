package com.hx.test.leetcodeTopic;

import com.hx.test.javaCollection.TreeNode;

import java.util.Stack;

/**
 * @program: leetcode
 * @description: 101. 对称二叉树
 * @author: hux
 * @create: 2020-05-14 14:58
 **/
public class SymmetricTree_101 {
 private static class TreeNode {
     int val;
    TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }
    static boolean isEqual(TreeNode s, TreeNode t) {
        if (s != null && t != null) {
            return s.val == t.val && isEqual(s.left, t.right) && isEqual(s.right, t.left);
        } else return s == null && t == null;
    }

    public static boolean isSymmetricTreeRecursive(TreeNode root) {
        if (root == null) return true;
        else return isEqual(root.left, root.right);
    }

    public static boolean isSymmetricTreeIterative(TreeNode root) {
     if (root==null) return true;
     Stack<TreeNode> stack=new Stack<>();
     stack.push(root.left);
     stack.push(root.right);
     while (!stack.empty()){
         TreeNode s=stack.pop(),t=stack.pop();
         if (s==null&&t==null) continue;
         if (s==null||t==null) return false;
         if (s.val!=t.val) return false;

         stack.push(s.left);
         stack.push(t.right);
         stack.push(t.left);
         stack.push(s.right);
     }

     return true;
    }

    public static void main(String[] args) {
      TreeNode[] nodes=new TreeNode[7];
        nodes[0] = new TreeNode(1);
        nodes[1] = new TreeNode(2);
        nodes[2] = new TreeNode(2);
        nodes[3] = new TreeNode(4);
        nodes[4] = new TreeNode(8);
        nodes[5] = new TreeNode(8);
        nodes[6] = new TreeNode(4);

        TreeNode node = null;
        node=nodes[0];
        node.left=nodes[1];
        node.right=nodes[2];
        node.left.left=nodes[3];
        node.left.right=nodes[4];
        node.right.left=nodes[5];
        node.right.right=nodes[6];

        System.out.println(isSymmetricTreeIterative(nodes[0]));
    }
}
