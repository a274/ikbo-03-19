package com.company.task2;


public class LinkedQueue extends AbstractQueue implements Queue {

    private Node head;
    private Node rear;

    protected void enqueue(Object element) {
        Node key = rear;
        rear = new Node(element, null);
        if (size == 0) {
            head = rear;
        } else {
            key.next = rear;
        }
    }

    protected void dequeue() {
        head = head.next;
    }

    protected Object element() {
        return head.value;
    }

    protected void clear() {
    }

    protected Object[] toArray(Object[] newQueue) {
        newQueue[0] = head.value;
        Node key = head.next;
        for (int i = 1; i < size; i++) {
            newQueue[i] = key.value;
            key = key.next;
        }
        return newQueue;
    }
}