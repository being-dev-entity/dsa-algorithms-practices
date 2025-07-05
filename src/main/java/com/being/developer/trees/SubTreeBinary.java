package com.being.developer.trees;

public class SubTreeBinary {
    public static void main(String[] args) {
        Integer root[] = { 3, 4, 5, 1, 2 };
        Integer subRoot[] = { 4, 1, 2 };
        TreeNode rootNode = TreeUtils.buildTree(root);
        TreeNode subRootNode = TreeUtils.buildTree(subRoot);
        System.out.println(isSubtree(rootNode, subRootNode));
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;

        if (isSame(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean isSame(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null)
            return true;

        if (tree1 == null || tree2 == null)
            return false;

        if (tree1.val != tree2.val)
            return false;

        return isSame(tree1.left, tree2.left) && isSame(tree1.right, tree2.right);
    }
}
