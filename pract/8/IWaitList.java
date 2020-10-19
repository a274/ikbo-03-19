package com.company;

import java.util.Collection;

/** Main interface of WaitList classes */

public interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
}
