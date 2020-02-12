package com.company.DataStructures;

import java.util.LinkedList;
import java.util.Queue;

/*
Impl. of printing job with help of queues
 */
public class QueueExample {
    private static Queue<String> printQueue = new LinkedList<>();


    public static void queuePrintJob(String job){
        printQueue.add(job);
    }

    public static void runPrintJob(){
        while(!printQueue.isEmpty()){
            System.out.println(printQueue.poll());
        }
    }

}
