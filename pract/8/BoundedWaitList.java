package com.company;

/** One of realisations of WaitList classes */

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (super.content.size() < capacity) {
            super.add(element);
        }
    }

    @Override
    public waitList getType() {
        return waitList.BOUNDED_WAIT_LIST;
    }

    @Override
    public String toString() {
        return "BoundedWaitList\n" + super.toString();
    }
}
