package com.hx.test.leetcodeTopic;

import com.hx.test.utils.TreeNodeUtils;

/**
 * @program: leetcode
 * @description: 110. 平衡二叉树
 * @author: hux
 * @create: 2020-09-01 14:57
 **/
public class BalancedBinaryTree_110 {


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static int getHeight(TreeNode root){
        if (root==null) return 0;
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return Math.max(left,right)+1;
    }

    public static boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        //取绝对值
        return Math.abs(getHeight(root.left)-getHeight(root.right)) <= 1 &&
                isBalanced(root.left)&&isBalanced(root.right);
    }

    public static void main(String[] args) {
        TreeNode[] nodes = new TreeNode[10];

        nodes[1]=new TreeNode(1);
        nodes[2]=new TreeNode(2);
        nodes[3]=new TreeNode(2);
        nodes[4]=new TreeNode(3);
        nodes[5]=new TreeNode(3);
        nodes[6]=null;
        nodes[7]=null;
        nodes[8]=new TreeNode(4);
        nodes[9]=new TreeNode(4);

        TreeNode node=nodes[1];
        node.left=nodes[2];
        node.right=nodes[3];
        node.left.left=nodes[4];
        node.left.right=nodes[5];
        node.left.left.left=nodes[8];
        node.left.left.right=nodes[9];

        System.out.println(isBalanced(node));
    }
}
