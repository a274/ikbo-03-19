package com.company;

public class Array<E> {
    private E[] array;
    private int index = 0;

    public Array() {
        this.array = (E[]) new Object[10];
    }

    public void add(E e) {
        array[index] = e;
        index++;
    }

    public E get(int i) {
        if (i < this.index) return array[i];
        return null;
    }
}
