package com.company;

import com.company.Algorithms.Search;
import com.company.Algorithms.Sort.InsertionSort;
import com.company.DataStructures.BinaryTree;
import com.company.DataStructures.LinkedList.Node;
import com.company.DataStructures.LinkedList.Node.DoubleLinkedList;
import com.company.DataStructures.QueueExample;
import com.company.DataStructures.RecursionExample;
import com.company.DataStructures.StackExample;

public class Main {

    public static void main(String[] args) {
        int[] orderedList = {1,2,3,4,5,6,7,8};
        int[] list = {9,2,3,4,5,6,7,8,8,9,2,3,4,5,6,7,8,8,9};
        int[] duplicateList = {9,2,3,4,5,6,9,8};
        int[] duplicateList2 = {Integer.MAX_VALUE,2,3,4,5,6,9,Integer.MAX_VALUE};

//        System.out.println(Search.binarySearch(orderedList,8));

//        BubbleSort.sort(list);
//        SelectionSort.sort(list);
//        InsertionSort.sort(list);


//        StackExample.linter("([[]])");

//        QueueExample.queuePrintJob("First");
//        QueueExample.queuePrintJob("Second");
//        QueueExample.runPrintJob();

//        RecursionExample.countDown(10);
//        System.out.println(RecursionExample.factorial(3));

//        DoubleLinkedList myDLL = new DoubleLinkedList();
//        myDLL.insertAtEnd("A");
//        myDLL.insertAtEnd("B");
//        myDLL.insertAtEnd("C");
//        System.out.println(myDLL.removeFromFront().getData());
//        System.out.println(myDLL.removeFromFront().getData());
//        System.out.println(myDLL.removeFromFront().getData());
//        System.out.println(myDLL.removeFromFront().getData());

        BinaryTree myTree = new BinaryTree(1);
        myTree.insert(2, myTree);
        myTree.insert(3, myTree);
        myTree.insert(3, myTree);
        myTree.insert(10, myTree);
        myTree.insert(79, myTree);







    }
}
