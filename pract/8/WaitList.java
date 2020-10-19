package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;


/** Base class of WaitList classes */

public class WaitList<E> implements IWaitList<E>{
    public enum waitList {
        UNFAIR_WAIT_LIST,
        BOUNDED_WAIT_LIST,
        WAIT_LIST
    }

    private final waitList type = waitList.WAIT_LIST;

    public waitList getType() {
        return type;
    }

    protected ConcurrentLinkedQueue<E> content = new ConcurrentLinkedQueue<>();

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    public void remove(E element) {}

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.content = content;
    }

    public WaitList() {
    }

    @Override
    public String toString() {
        return "WaitList:\n" + content.toString();
    }
}
