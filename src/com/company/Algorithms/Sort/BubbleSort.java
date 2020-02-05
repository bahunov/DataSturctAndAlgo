package com.company.Algorithms.Sort;

/*
Bubble sort has O(n2)
 */
public class BubbleSort implements Sort {

    public static void sort(int[] list){
        int unSortedUntilIndex = list.length - 1;
        boolean sorted = false;
        int swapA, swapB;

        while(!sorted){
            sorted = true;
            for (int i = 0; i < unSortedUntilIndex; i++) {
                if(list[i] > list[i+1]){
                    sorted = false;
                    swapA = list[i];
                    swapB = list[i+1];
                    list[i] = swapB;
                    list[i+1] = swapA;
                }
            }
            unSortedUntilIndex--;
        }
        Sort.printArray(list);
    }

}
