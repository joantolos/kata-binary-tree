package com.joantolos.kata.binary.tree.problems;

import com.joantolos.kata.binary.tree.TreeNode;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode tmpLeft = root.left;
            root.left = root.right;
            root.right = tmpLeft;

            invertTree(root.left);
            invertTree(root.right);
        }

        return root;
    }

}
