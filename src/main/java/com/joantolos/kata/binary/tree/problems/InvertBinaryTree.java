package com.joantolos.kata.binary.tree.problems;

import com.joantolos.kata.binary.tree.TreeNode;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        root = new TreeNode(4);
        TreeNode n11 = new TreeNode(2);
        TreeNode n12 = new TreeNode(7);
        TreeNode n21 = new TreeNode(1);
        TreeNode n22 = new TreeNode(3);
        TreeNode n31 = new TreeNode(6);
        TreeNode n32 = new TreeNode(9);
        root.right = n11;
        root.left = n12;
        n11.right = n21;
        n11.left = n22;
        n12.right = n31;
        n12.left = n32;
        return root;
    }
}
