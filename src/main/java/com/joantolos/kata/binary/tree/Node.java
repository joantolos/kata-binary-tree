package com.joantolos.kata.binary.tree;

public class Node<T> {
    Node<T> left, right;
    T data;

    public Node(T data) {
        this.data = data;
    }
}