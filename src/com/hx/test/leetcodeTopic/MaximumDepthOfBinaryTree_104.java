package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 104. 二叉树的最大深度
 * @author: hux
 * @create: 2020-05-28 18:03
 **/
public class MaximumDepthOfBinaryTree_104 {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        if (root.left==null&&root.right==null) return 1;
        if (root.left==null) return maxDepth(root.right)+1;
        if (root.right==null) return maxDepth(root.left)+1;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
