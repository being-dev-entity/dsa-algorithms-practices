package com.being.developer.trees;
/**
 * [110] Balanced Binary Tree
 */
 
class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int getHeight(TreeNode treeNode) {
        if (treeNode == null)
            return 0;
        int leftHeight = getHeight(treeNode.left);
        int rightHeight = getHeight(treeNode.right);
        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;

    }
}
