package com.hx.test.leetcodeTopic;

import com.hx.test.utils.TreeNodeUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: leetcode
 * @description: 102. 二叉树的层序遍历
 * @author: hux
 * @create: 2020-06-16 17:35
 **/
public class BinaryTreeLevelOrderTraversal_102 {
    private static class TreeNode {
      int val;
      TreeNode left;
    TreeNode right;
     TreeNode(int x) { val = x; }
  }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null) return new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            List<Integer> elem=new ArrayList<>();
            int size=q.size();
            for (int i=0;i<size;i++){
                TreeNode s=q.poll();
                elem.add(s.val);
                if (s.left!=null) q.add(s.left);
                if (s.right!=null) q.add(s.right);
            }
            result.add(elem);
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

        levelOrder(node);
        System.out.println("ok");
    }
}
