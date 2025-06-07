package com.being.developer.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtils {

    public static TreeNode buildTreeR1(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    public static TreeNode buildTree(Integer[] arr) {
        return buildTreeHelper(arr, 0);
    }

    private static TreeNode buildTreeHelper(Integer[] arr, int i) {
        if (i >= arr.length || arr[i] == null)
            return null;

        TreeNode node = new TreeNode(arr[i]);
        node.left = buildTreeHelper(arr, 2 * i + 1);
        node.right = buildTreeHelper(arr, 2 * i + 2);
        return node;
    }

    // Optional: Inorder traversal for testing
    public static void printInOrder(TreeNode root) {
        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        Integer[] rootArray = { 3, 9, 20, null, null, 15, 7 };
        TreeNode root = buildTree(rootArray);
        printInOrder(root); // Expected Output: 9 3 15 20 7
    }
}
