package com.company.DataStructures.LinkedList;

public class Node {
    public Node nextNode, previousNode;
    private Object data;

    public Node(Object data){
        this.data = data;
    }

    public Object getData(){
        return data;
    }

    public static class DoubleLinkedList{
        private Node firstNode, lastNode;

        public DoubleLinkedList(){
            firstNode = null;
            lastNode = null;
        }

        public void insertAtEnd(Object data){
            Node newNode = new Node(data);
            if(firstNode == null){
                firstNode = newNode;
                lastNode = newNode;
            } else {
                newNode.previousNode = lastNode;
                lastNode.nextNode = newNode;
                lastNode = newNode;
            }
        }

        public Node removeFromFront(){
           Node removedNode = firstNode;
           firstNode = firstNode.nextNode;
           return removedNode;
        }

    }
}


