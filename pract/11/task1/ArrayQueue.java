package com.company.task1;


import java.util.Arrays;

public class ArrayQueue {
    private int size;
    private Object[] elements = new Object[10];

    public void enqueue(Object element) {
        assert element != null;

        elements = Arrays.copyOf(elements, ++size);
        elements[size - 1] = element;
    }

    public Object dequeue() {
        assert size > 0;

        Object value = element();
        Object[] copy_elements = new Object[--size];
        if (size >= 0) System.arraycopy(elements, 1, copy_elements, 0, size);
        elements = copy_elements;
        return value;
    }

    public Object element() {
        assert size > 0;

        return elements[0];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public ArrayQueue clear() {
        return new ArrayQueue();
    }
}
