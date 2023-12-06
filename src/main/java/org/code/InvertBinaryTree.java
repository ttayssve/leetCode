package org.code;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6),
                        new TreeNode(9)));
        System.out.println(root);
        System.out.println(invertTree(root));
    }

    private static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 1. Invert the left subtree
        TreeNode left = invertTree(root.left);
        // 2. Invert the right subtree
        TreeNode right = invertTree(root.right);
        // 3. Swap the left and right subtree
        root.left = right;
        root.right = left;
        return root;
    }
}
