package org.example;


public class Node <T> {
    private Squirrel<T> dataWrapper;
    private Node<T> rightNode;
    private Node<T> leftNode;


    public Node(Squirrel<T> data) {
        this.dataWrapper = data;
        this.rightNode = null;
        this.leftNode = null;
    }


    public void setRight(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    public void setLeft(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<T> right() {
        return this.rightNode;
    }

    public Node<T> left(){
        return this.leftNode;
    }

    public Squirrel<T> getData() {
        return dataWrapper;
    }
}