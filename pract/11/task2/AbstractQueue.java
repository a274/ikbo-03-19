package com.company.task2;

public abstract class AbstractQueue implements Queue {
    protected int size;

    public void superEnqueue(Object element) {
        assert element != null;
        enqueue(element);
        size++;
    }

    protected abstract void enqueue(Object element);

    public Object superDequeue() {
        assert size > 0;
        Object result = superElement();
        size--;
        dequeue();
        return result;
    }

    protected abstract void dequeue();

    public Object superElement() {
        assert size > 0;
        return element();
    }

    protected abstract Object element();

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void superClear() {
        clear();
        size = 0;
    }

    protected abstract void clear();

    public Object[] superToArray() {
        if (size == 0) {
            return new Object[0];
        } else {
            Object[] newQueue = new Object[size];
            newQueue = toArray(newQueue);
            return newQueue;
        }
    }

    protected abstract Object[] toArray(Object[] newQueue);
}