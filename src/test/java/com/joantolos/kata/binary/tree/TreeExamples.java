package com.joantolos.kata.binary.tree;

public class TreeExamples {

    public TreeNode treeOne() {
        TreeNode root = new TreeNode(2);
        TreeNode n11 = new TreeNode(7);
        TreeNode n12 = new TreeNode(5);
        TreeNode n21 = new TreeNode(2);
        TreeNode n22 = new TreeNode(6);
        TreeNode n23 = new TreeNode(3);
        TreeNode n24 = new TreeNode(6);
        TreeNode n31 = new TreeNode(5);
        TreeNode n32 = new TreeNode(8);
        TreeNode n33 = new TreeNode(4);
        TreeNode n34 = new TreeNode(5);
        TreeNode n35 = new TreeNode(8);
        TreeNode n36 = new TreeNode(4);
        TreeNode n37 = new TreeNode(5);
        TreeNode n38 = new TreeNode(8);
        root.left = n11;
        root.right = n12;
        n11.left = n21;
        n11.right = n22;
        n12.left = n23;
        n12.right = n24;
        n21.left = n31;
        n21.right = n32;
        n22.left = n33;
        n22.right = n34;
        n23.left = n35;
        n23.right = n36;
        n24.left = n37;
        n24.right = n38;
        return root;
    }

    public TreeNode treeTwo() {
        TreeNode root = new TreeNode(2);
        TreeNode n11 = new TreeNode(7);
        TreeNode n12 = new TreeNode(5);
        TreeNode n21 = new TreeNode(2);
        TreeNode n22 = new TreeNode(6);
        TreeNode n23 = new TreeNode(9);
        TreeNode n31 = new TreeNode(5);
        TreeNode n32 = new TreeNode(8);
        TreeNode n33 = new TreeNode(4);
        root.left = n11;
        root.right = n12;
        n11.left = n21;
        n11.right = n22;
        n12.right = n23;
        n22.left = n31;
        n22.right = n32;
        n23.left = n33;
        return root;
    }

    public Node<Integer> treeTwoGenericNode() {
        Node<Integer> root = new Node<>(2);
        Node<Integer> n11 = new Node<>(7);
        Node<Integer> n12 = new Node<>(5);
        Node<Integer> n21 = new Node<>(2);
        Node<Integer> n22 = new Node<>(6);
        Node<Integer> n23 = new Node<>(9);
        Node<Integer> n31 = new Node<>(5);
        Node<Integer> n32 = new Node<>(8);
        Node<Integer> n33 = new Node<>(4);
        root.left = n11;
        root.right = n12;
        n11.left = n21;
        n11.right = n22;
        n12.right = n23;
        n22.left = n31;
        n22.right = n32;
        n23.left = n33;
        return root;
    }
}
