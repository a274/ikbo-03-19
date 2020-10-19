package com.company;


/** One of realisations of WaitList classes */

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {}

    public void remove(E element) {
        if (element.equals(content.peek())) {
            content.remove(element);
            moveToBack(element);
            return;
        }
        content.remove(element);
    }

    public void moveToBack(E element) {
        content.add(element);
    }

    @Override
    public waitList getType() {
        return waitList.UNFAIR_WAIT_LIST;
    }

    @Override
    public String toString() {
        return "UnfairWaitList\n" + super.toString();
    }
}
