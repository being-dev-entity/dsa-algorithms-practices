package com.being.developer.trees;

/**
 * Given the root of a binary tree, return its maximum depth.
 * 
 * A binary tree's maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * Example 2:
 * 
 * Input: root = [1,null,2]
 * Output: 2
 * 
 * [104] Maximum Depth of Binary Tree.
 */
public class MaxDepthBinaryTree {
    public static void main(String[] args) {
        Integer[] array = { 3, 9, 20, null, null, 15, 7 };
        TreeNode inputTree = TreeUtils.buildTree(array);
        int maxDepth = findMaxDepth(inputTree);
        System.out.println("Max depth: " + maxDepth);
        // output Max depth: 3
    }

    private static int findMaxDepth(TreeNode root) {

        if (root == null)
            return 0;
        int rightMaxDepth = findMaxDepth(root.right);
        int leftMax = findMaxDepth(root.left);

        int depth = Math.max(rightMaxDepth, leftMax) + 1; // for self root adding one
        return depth;
    }
}
