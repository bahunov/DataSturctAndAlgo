package com.company;

import com.company.Algorithms.Search;

public class Main {

    public static void main(String[] args) {
        int[] orderedList = {1,2,3,4,5,6,7,8};

        int search = Search.binarySearch(orderedList, 8);

        System.out.println(search);


    }
}
