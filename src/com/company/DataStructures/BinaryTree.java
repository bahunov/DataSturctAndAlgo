package com.company.DataStructures;

public class BinaryTree {
    private int value;
    private BinaryTree leftChild, rightChild;

    public BinaryTree (int value){
        this.value = value;
        leftChild = null;
        rightChild = null;
    }

    public BinaryTree search(int value, BinaryTree node){
        if(node == null || node.value == value){
            return node;
        } else if (value < node.value){
            return search(value, node.leftChild);
        } else {
            return search(value, node.rightChild);
        }
    }

    public void insert(int value, BinaryTree node){
        if(value < node.value){
            if(node.leftChild == null){
                node.leftChild = new BinaryTree(value);
            } else {
                insert(value, node.leftChild);
            }
        } else if(value > node.value){
            if(node.rightChild == null) {
                node.rightChild = new BinaryTree(value);
            } else {
                insert(value,rightChild);
            }
        }
    }
}
