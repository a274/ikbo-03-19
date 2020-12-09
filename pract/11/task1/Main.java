package com.company.task1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("ArrayQueueModule: ");
        System.out.println("is empty " + ArrayQueueModule.isEmpty());
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        ArrayQueueModule.enqueue(4);
        ArrayQueueModule.enqueue(5);
        System.out.println("is empty " + ArrayQueueModule.isEmpty());
        System.out.println("size = " + ArrayQueueModule.size());
        System.out.println("delete: " + ArrayQueueModule.dequeue());
        System.out.println("size = " + ArrayQueueModule.size());
        System.out.println("first element: " + ArrayQueueModule.element());

        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        System.out.println("ArrayQueueADT: ");
        System.out.println("is empty " + ArrayQueueADT.isEmpty(arrayQueueADT));
        ArrayQueueADT.enqueue(arrayQueueADT, 1);
        ArrayQueueADT.enqueue(arrayQueueADT, 2);
        ArrayQueueADT.enqueue(arrayQueueADT, 3);
        ArrayQueueADT.enqueue(arrayQueueADT, 4);
        ArrayQueueADT.enqueue(arrayQueueADT, 5);
        System.out.println("is empty " + ArrayQueueADT.isEmpty(arrayQueueADT));
        System.out.println("size = " + ArrayQueueADT.size(arrayQueueADT));
        System.out.println("delete: " + ArrayQueueADT.dequeue(arrayQueueADT));
        System.out.println("size = " + ArrayQueueADT.size(arrayQueueADT));
        System.out.println("first element: " + ArrayQueueADT.element(arrayQueueADT));

        ArrayQueue arrayQueue = new ArrayQueue();
        System.out.println("ArrayQueue: ");
        System.out.println("is empty " + arrayQueue.isEmpty());
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        System.out.println("is empty " + arrayQueue.isEmpty());
        System.out.println("size = " + arrayQueue.size());
        System.out.println("delete: " + arrayQueue.dequeue());
        System.out.println("size = " + arrayQueue.size());
        System.out.println("first element: " + arrayQueue.element());
    }
}
