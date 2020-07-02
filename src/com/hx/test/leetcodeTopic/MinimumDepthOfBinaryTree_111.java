package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 111. 二叉树的最小深度
 * @author: hux
 * @create: 2020-05-27 18:55
 **/
public class MinimumDepthOfBinaryTree_111 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDepth(TreeNode root) {
        if (root==null) return 0;
        if (root.left==null&&root.right==null) return 1;
        if (root.left==null) return minDepth(root.right)+1;
        if (root.right==null) return minDepth(root.left)+1;
        return Math.min(minDepth(root.right),minDepth(root.left))+1;
    }
}
