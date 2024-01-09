package org.code;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6),
                        new TreeNode(9)));
        int maxDepth = maxDepth(root);
        System.out.println(maxDepth(root));
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 1. Find the max depth of the left subtree
        int left = maxDepth(root.left);
        // 2. Find the max depth of the right subtree
        int right = maxDepth(root.right);
        // 3. Return the max of the left and right subtree
        return Math.max(left, right) + 1;
    }
}
