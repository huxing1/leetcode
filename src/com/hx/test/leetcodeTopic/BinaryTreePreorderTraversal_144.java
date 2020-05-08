package com.hx.test.leetcodeTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: 144. 二叉树的前序遍历
 * @author: hux
 * @create: 2020-04-22 17:03
 **/
public class BinaryTreePreorderTraversal_144 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static List<Integer> ans=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return ans;
    }
    public static void dfs(TreeNode node) {
        if (node == null) return;
        ans.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}
