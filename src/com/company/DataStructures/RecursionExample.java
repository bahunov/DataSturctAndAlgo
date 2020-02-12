package com.company.DataStructures;

public class RecursionExample {

    public static void countDown(int number){
        if(number == 0){
            return;
        } else{
            System.out.println(number);
            countDown(number-1);
        }
    }

    public static int factorial(int number){
        int sum;
        if(number == 1){
            return 1;
        } else {
            sum = number * factorial(number-1);
            return sum;
        }
    }
}
