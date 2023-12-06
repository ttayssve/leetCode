package org.code;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(3);
        root.right = right;
        List<Integer> treeInorder = inorderTraversal(root);
        for (Integer i : treeInorder)
            System.out.println(i);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> treeInorder = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        if (root.left == null && root.right == null) {
            treeInorder.add(root.val);
            return treeInorder;
        }
        if (root.left != null) {
            List<Integer> rl = inorderTraversal(root.left);
            treeInorder.addAll(rl);
        }
        treeInorder.add(root.val);
        if (root.right != null) {
            List<Integer> rr = inorderTraversal(root.right);
            treeInorder.addAll(rr);
        }
        return treeInorder;
    }
}
