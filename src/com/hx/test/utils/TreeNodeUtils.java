package com.hx.test.utils;

/**
 * @program: leetcode
 * @description:
 * @author: hux
 * @create: 2020-06-16 17:47
 **/
public class TreeNodeUtils {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        //像treenode中写入数据可以参考 https://my.oschina.net/styshoo/blog/758921
        TreeNode[] nodes = new TreeNode[5];
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
        nodes[1] = null;
    }
}
