package com.company.DataStructures;

import java.util.HashMap;

/*
Solving if an array has duplicate elements with hashtable.
Hash map has O(1) in terms of reading and insertion
 */

public class HashTableExample {

    public static boolean hasDuplicates(int[] array){
        HashMap<Integer, Integer> existingValue = new HashMap<>();

        for (int i = 0; i < array.length ; i++) {
            if(existingValue.get(array[i]) == null){
                existingValue.put(array[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
