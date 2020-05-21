package com.hx.test.leetcodeTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: 145. 二叉树的后序遍历
 * @author: hux
 * @create: 2020-04-22 17:48
 **/
public class BinaryTreePostorderTraversal_145 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Integer> ans = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        dfs(node.right);
        ans.add(node.val);
    }
}
