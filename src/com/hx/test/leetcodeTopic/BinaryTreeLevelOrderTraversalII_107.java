package com.hx.test.leetcodeTopic;

import java.util.*;

/**
 * @program: leetcode
 * @description: 107. 二叉树的层次遍历 II
 * @author: hux
 * @create: 2020-06-29 14:11
 **/
public class BinaryTreeLevelOrderTraversalII_107 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root==null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Stack<List<Integer>> s = new Stack<>();

        while (!q.isEmpty()){
            List<Integer> elem = new ArrayList<>();
            int size=q.size();
            for (int i=0;i<size;i++){
                TreeNode node=q.poll();
                elem.add(node.val);
                if (node.left!=null) q.add(node.left);
                if (node.right!=null) q.add(node.right);

            }
            s.push(elem);
        }
        while (!s.empty()) {
            result.add(s.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode[] nodes = new TreeNode[6];
        nodes[1]=new TreeNode(1);
        nodes[2]=new TreeNode(2);
        nodes[3]=new TreeNode(4);
        nodes[4]=new TreeNode(8);
        nodes[5]=new TreeNode(16);

       TreeNode node=nodes[1];
        node.left=nodes[2];
        node.right=nodes[3];
        node.right.left=nodes[4];
        node.right.right=nodes[5];

        levelOrderBottom(node);
        System.out.println("ok");
    }

}
