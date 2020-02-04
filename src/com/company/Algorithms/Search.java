package com.company.Algorithms;

public class Search {

    public static int linearSearch(int[] orderedList, int searchValue){
        for (int element: orderedList) {
            if(element == searchValue){
                return searchValue;
            }

            else if (element > searchValue){
                break;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] orderedList, int searchValue){
        int lowerBound = 0;
        int upperBound = orderedList.length -1;
        int midPoint, valueAtMidPoint;

        while(lowerBound <= upperBound){
            midPoint = (lowerBound+upperBound)/2;
            valueAtMidPoint = orderedList[midPoint];

            if(searchValue < valueAtMidPoint){
                upperBound = valueAtMidPoint - 1;
            }
            else if(searchValue > valueAtMidPoint){
                lowerBound = valueAtMidPoint + 1;
            }
            else if(searchValue == valueAtMidPoint){
                return valueAtMidPoint;
            }
        }
        return -1;
    }

}
