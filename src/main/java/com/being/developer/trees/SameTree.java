package com.being.developer.trees;
// leet code 100 

// Given the roots of two binary trees p and q, write a function to check if they are the same or not.
// Two binary trees are considered the same if they are structurally identical, 
// and the nodes have the same value
public class SameTree {
    public static void main(String[] args) {
        // Integer tree1[] = { 3, 4, 5, 1, 2 };
        // Integer tree2[] = { 4, 1, 2 };
        Integer tree1[] = { 1, 2, 3, 4, 5 };
        Integer tree2[] = { 1, 2, 3, 4, 5 };
        TreeNode tree1Node = TreeUtils.buildTree(tree1);
        TreeNode tree2Node = TreeUtils.buildTree(tree2);
        System.out.println(isSame(tree1Node, tree2Node));
    }

    public static boolean isSame(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null)
            return true;

        if (tree1 == null || tree2 == null)
            return false;

        if (tree1.val != tree2.val)
            return false;

        return isSame(tree1.left, tree2.left) && isSame(tree1.right, tree2.right);
    }
}
