package com.being.developer.trees;

/*
Leet code: 543. Diameter of Binary Tree

Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 */
public class DiameterBinaryTree {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5 };
        TreeNode inputTree = TreeUtils.buildTree(array);
        System.out.println("Diamter:" + diameterOfBinaryTree(inputTree));
        // output 3
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        int[] maxDiameter = { 0 }; // Array to store max diameter (acts like a reference)
        getHeight(root, maxDiameter);
        return maxDiameter[0];
    }

    private static int getHeight(TreeNode root, int[] maxDiameter) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left, maxDiameter);
        int rightHeight = getHeight(root.right, maxDiameter);
        maxDiameter[0] = Math.max(maxDiameter[0], leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;

    }
}
