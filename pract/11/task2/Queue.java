package com.company.task2;

public interface Queue {
    void superEnqueue(Object element);

    Object superDequeue();

    Object superElement();

    int size();

    boolean isEmpty();

    void superClear();

    Object[] superToArray();
}
