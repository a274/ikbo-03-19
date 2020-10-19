package com.company;

/** Testing class */

public class TestWaitList<E> {

    private WaitList<E> list;

    public void setTestWaitList(WaitList<E> list) {
        this.list = list;
    }

    private void fill(E[] elements) {
        for (E element : elements) list.add(element);
    }

    public void test(E[] es) {
        System.out.println("isEmpty?   " + list.isEmpty());
        fill(es);
        System.out.println("After adding elements\nisEmpty?   " + list.isEmpty());

        System.out.println(list);

        if (list.getType() == WaitList.waitList.UNFAIR_WAIT_LIST) {
            list.remove(es[es.length / 3]);
            list.remove(es[0]);
            list.remove(es[es.length / 3 * 2]);
        } else {
            list.remove();
            list.remove();
            list.remove();
        }

        System.out.println("After removing 3 elements\n" + list);
    }
}
