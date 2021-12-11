package com.joantolos.kata.binary.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Printer {

    public <T extends Comparable<?>> void printNode(Node<T> root) {
        printNodeInternal(Collections.singletonList(root), 1, this.maxLevel(root));
    }

    private <T extends Comparable<?>> void printNodeInternal(List<Node<T>> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || this.areAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        this.printWhitespaces(firstSpaces);

        List<Node<T>> newNodes = new ArrayList<>();
        for (Node<T> node : nodes) {
            if (node != null) {
                System.out.print(node.data);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            this.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= edgeLines; i++) {
            for (Node<T> node : nodes) {
                this.printWhitespaces(firstSpaces - i);
                if (node == null) {
                    this.printWhitespaces(edgeLines + edgeLines + i + 1);
                    continue;   // TODO ugly
                }

                if (node.left != null) {
                    System.out.print("/");
                }
                else {
                    this.printWhitespaces(1);
                }

                this.printWhitespaces(i + i - 1);

                if (node.right != null) {
                    System.out.print("\\");
                } else {
                    this.printWhitespaces(1);
                }

                this.printWhitespaces(edgeLines + edgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private <T extends Comparable<?>> int maxLevel(Node<T> node) {
        if (node == null) {
            return 0;
        }

        return Math.max(this.maxLevel(node.left), this.maxLevel(node.right)) + 1;
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
