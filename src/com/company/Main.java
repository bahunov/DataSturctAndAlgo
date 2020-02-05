package com.company;

import com.company.Algorithms.Sort.BubbleSort;
import com.company.Algorithms.Sort.InsertionSort;
import com.company.Algorithms.Sort.SelectionSort;
import com.company.Algorithms.Sort.Sort;
import com.company.DataStructures.HashTableExample;

public class Main {

    public static void main(String[] args) {
        int[] orderedList = {1,2,3,4,5,6,7,8};
        int[] list = {9,2,3,4,5,6,7,8,8,9,2,3,4,5,6,7,8,8,9,2,3,4,5,6,7,8,8,1,0};
        int[] duplicateList = {9,2,3,4,5,6,9,8};
        int[] duplicateList2 = {Integer.MAX_VALUE,2,3,4,5,6,9,Integer.MAX_VALUE};

//        BubbleSort.sort(list);
//        SelectionSort.sort(list);
//        InsertionSort.sort(list);
        System.out.println(HashTableExample.hasDuplicates(duplicateList2));

    }
}
