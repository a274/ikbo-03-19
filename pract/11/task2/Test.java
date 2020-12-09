package com.company.task2;

public class Test {
    public static void main(String[] args) {

        System.out.println("LinkedQueue: ");
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.superEnqueue(1);
        linkedQueue.superEnqueue(2);
        linkedQueue.superEnqueue(3);
        linkedQueue.superEnqueue(4);
        linkedQueue.superEnqueue(5);
        System.out.println("size = " + linkedQueue.size());
        System.out.println("is empty " + linkedQueue.isEmpty());
        System.out.println("first element: " + linkedQueue.element());

        System.out.println("ArrayQueue: ");
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.superEnqueue(1);
        arrayQueue.superEnqueue(2);
        arrayQueue.superEnqueue(3);
        arrayQueue.superEnqueue(4);
        arrayQueue.superEnqueue(5);
        arrayQueue.superEnqueue(6);
        arrayQueue.superEnqueue(7);
        arrayQueue.superEnqueue(8);
        arrayQueue.superEnqueue(9);
        arrayQueue.superEnqueue(10);
        System.out.println("size = " + arrayQueue.size());
        System.out.println("is empty " + arrayQueue.isEmpty());
        System.out.println("first element: " + arrayQueue.element());
    }
}