package com.company.Algorithms.Sort;

/*
Selection sort has O(n2), compared to bubble sort, it's twice as fast.
 */
public class SelectionSort implements Sort {

    public static void sort(int[] list){
        int lowestNumberIndex;
        int temp;

        for (int i = 0; i < list.length; i++) {
            lowestNumberIndex = i;
            for (int j = i+1; j < list.length ; j++) {
                if(list[j] < list[lowestNumberIndex]){
                    lowestNumberIndex = j;
                }
            }
            if(lowestNumberIndex != i){
                temp = list[i];
                list[i] = list[lowestNumberIndex];
                list[lowestNumberIndex] = temp;
            }
        }

        Sort.printArray(list);
    }

}
