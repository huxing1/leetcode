package com.hx.test.leetcodeTopic;


import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: 94. 二叉树的中序遍历
 * @author: hux
 * @create: 2020-04-21 17:34
 **/
public class BinaryTreeInorderTraversal_94 {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

   static List<Integer> ans = new ArrayList<>();

    private static List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return ans;
    }

    public static void dfs(TreeNode node) {
        if (node == null) return;
        //中序遍历按照：左-打印-右 执行
        dfs(node.left);
        ans.add(node.val);
        dfs(node.right);
    }

    public static void main(String[] args) {
        //像treenode中写入数据可以参考 https://my.oschina.net/styshoo/blog/758921
        TreeNode[] nodes=new TreeNode[5];
//        nodes[1]=new TreeNode(1);
//        nodes[2]=null;
//        nodes[3]=new TreeNode(2);
//        nodes[4]=new TreeNode(3);

//        TreeNode node = null;
//        for (int i = 1; i < nodes.length; i++) {
//            node=nodes[i];
//            if (node == null) continue;
//            if (i+1<nodes.length) {
//                node.left = nodes[i + 1];
//            }
//            if (i+2<nodes.length) {
//                node.right = nodes[i + 2];
//            }
//        }
        nodes[1]=null;
        inorderTraversal(nodes[1]);

    }
}
