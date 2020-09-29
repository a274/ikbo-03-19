package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static Comparator<Integer> getComp()
    {
        return Integer::compareTo;
    }

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        for (int i = 0; i < 5; i++)
            list1.add(i+1);

        ArrayList list2 = new ArrayList(list1);
        list2.addAll(5, list1);

        System.out.println("size - " + list2.size());
        for (Object element : list2)
            System.out.print(element + " ");
        System.out.println();

        System.out.println("the first index of the element 1 - " + list2.indexOf(1));
        System.out.println("the last index of the element 1 - " + list2.lastIndexOf(1));
        System.out.println("the element at the index 0 - " + list2.get(0));
        list2.remove(0);
        System.out.println("the element at the index 0 after changes - " + list2.get(0));
        list2.set(0, 10000);
        list2.sort(getComp());
        System.out.println("size after changes - " + list2.size());

        for (Object element : list2)
            System.out.print(element + " ");
        System.out.println();

        for (Object element : list2.subList(3, 7)) {
            System.out.print(element + " ");
        }
    }
}
