package org.code;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        root.left = left;
        root.right = right;
        System.out.println(isSymmetric(root));
    }

    private static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private static boolean isMirror(TreeNode nOne, TreeNode nTwo) {
        if (nOne == null && nTwo == null) {
            return true;
        }
        if (nOne == null || nTwo == null) {
            return false;
        }
        return nOne.val == nTwo.val
                && isMirror(nOne.left, nTwo.right)
                && isMirror(nOne.right, nTwo.left);
    }
}
