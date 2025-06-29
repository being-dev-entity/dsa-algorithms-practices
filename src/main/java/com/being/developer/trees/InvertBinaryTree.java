package com.being.developer.trees;

/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
 */
class InvertBinaryTree {
    public static void main(String[] args) {
        Integer[] array = { 2, 1, 3 };
        TreeNode inputTree = TreeUtils.buildTree(array);
        TreeNode invertTree = invertTree(inputTree);
        Integer invertTreeArray [] = TreeUtils.treeToArray(invertTree);
        // output [2,3,1]
        for (Integer integer : invertTreeArray) {
            System.out.print(integer + ",");
        }
    }

    public static TreeNode invertTree(TreeNode root) {
        return invertTreeNode(root);
    }

    private static TreeNode invertTreeNode(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode right = invertTreeNode(root.right);
        TreeNode left = invertTreeNode(root.left);

        root.right = left;
        root.left = right;

        return root;
    }
}