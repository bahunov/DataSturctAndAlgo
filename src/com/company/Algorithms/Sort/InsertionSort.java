package com.company.Algorithms.Sort;

public class InsertionSort implements Sort {

    public static void sort(int[] list){
        int position, tempValue;

        for (int i = 1; i < list.length; i++) {
            position = i;
            tempValue = list[i];

            while(position > 0 && (list[position - 1] > tempValue)){
                list[position] = list[position-1];
                position--;
            }

            list[position] = tempValue;
        }
        Sort.printArray(list);
    }
}
