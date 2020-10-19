package com.company;

/** Driver class */

public class Main {

    public static void main(String[] args) {

        TestWaitList<Integer> test = new TestWaitList<>();
        Integer[] es = {5, 2, 4, 4, 5, 6, 9, 1, 23};

        System.out.println("--------------------------- 1 ---------------------------");

        WaitList<Integer> list = new WaitList<>();
        test.setTestWaitList(list);
        test.test(es);

        System.out.println("--------------------------- 2 ---------------------------");

        BoundedWaitList<Integer> list2 = new BoundedWaitList<>(5);
        test.setTestWaitList(list2);
        test.test(es);

        System.out.println("--------------------------- 3 ---------------------------");

        UnfairWaitList<Integer> list3 = new UnfairWaitList<>();
        test.setTestWaitList(list3);
        test.test(es);
    }
}
