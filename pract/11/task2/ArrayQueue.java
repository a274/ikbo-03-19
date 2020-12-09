package com.company.task2;


public class ArrayQueue extends AbstractQueue implements Queue {

    private int head = 0;
    private Object[] elements = new Object[10];

    protected void enqueue(Object element) {
        setCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
    }

    protected void dequeue() {
        head = (head + 1) % elements.length;
    }

    protected Object element() {
        return elements[head];
    }

    protected void clear() {
        elements = new Object[10];
        head = 0;
    }

    private void setCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newQueue = new Object[2 * capacity];
        if (head == 0) {
            if (size >= 0) System.arraycopy(elements, 0, newQueue, 0, size);
        } else {
            if (elements.length - head >= 0)
                System.arraycopy(elements, head, newQueue, 0, elements.length - head);
            if ((head + size) % elements.length + 1 >= 0)
                System.arraycopy(elements, 0, newQueue, elements.length - head, (head + size) % elements.length + 1);
            head = 0;
        }
        elements = newQueue;
    }

    protected Object[] toArray(Object[] newQueue) {
        if (head + size <= elements.length) {
            if (head + size - head >= 0) System.arraycopy(elements, head, newQueue, 0, head + size - head);
        } else {
            if (elements.length - head >= 0)
                System.arraycopy(elements, head, newQueue, 0, elements.length - head);
            if ((head + size) % elements.length >= 0)
                System.arraycopy(elements, 0, newQueue, elements.length - head, (head + size) % elements.length);
        }
        return newQueue;
    }
}