package com.company.task1;

import java.util.Arrays;

public class ArrayQueueADT {
    private int size;
    private Object[] elements = new Object[10];

    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;

        queue.elements = Arrays.copyOf(queue.elements, ++queue.size);
        queue.elements[queue.size - 1] = element;
    }

    public static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0;

        Object value = element(queue);
        Object[] copy_elements = new Object[--queue.size];
        System.arraycopy(queue.elements, 1, copy_elements, 0, queue.size);
        queue.elements = copy_elements;
        return value;
    }

    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0;

        return queue.elements[0];
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static ArrayQueueADT clear() {
        return new ArrayQueueADT();
    }
}
