package com.joantolos.kata.binary.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Printer {

    public void printNode(String name, TreeNode root) {
        System.out.println(name + ":");
        printNodeInternal(Collections.singletonList(root), 1, this.maxLevel(root));
    }

    private void printNodeInternal(List<TreeNode> treeNodes, int level, int maxLevel) {
        if (treeNodes.isEmpty() || this.areAllElementsNull(treeNodes)) {
            return;
        }

        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        this.printWhitespaces(firstSpaces);

        List<TreeNode> newTreeNodes = new ArrayList<>();
        for (TreeNode treeNode : treeNodes) {
            if (treeNode != null) {
                System.out.print(treeNode.val);
                newTreeNodes.add(treeNode.left);
                newTreeNodes.add(treeNode.right);
            } else {
                newTreeNodes.add(null);
                newTreeNodes.add(null);
                System.out.print(" ");
            }

            this.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= edgeLines; i++) {
            for (TreeNode treeNode : treeNodes) {
                this.printWhitespaces(firstSpaces - i);
                if (treeNode == null) {
                    this.printWhitespaces(edgeLines + edgeLines + i + 1);
                    continue;   // TODO ugly
                }

                if (treeNode.left != null) {
                    System.out.print("/");
                }
                else {
                    this.printWhitespaces(1);
                }

                this.printWhitespaces(i + i - 1);

                if (treeNode.right != null) {
                    System.out.print("\\");
                } else {
                    this.printWhitespaces(1);
                }

                this.printWhitespaces(edgeLines + edgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newTreeNodes, level + 1, maxLevel);
    }

    private void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private <T extends Comparable<?>> int maxLevel(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        return Math.max(this.maxLevel(treeNode.left), this.maxLevel(treeNode.right)) + 1;
    }

    private <T> boolean areAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null) {
                return false;
            }
        }

        return true;
    }
}
