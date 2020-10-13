package com.company;

import java.util.*;

public class MainDoubleList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Double> first = new LinkedList<>();
        LinkedList<Double> second = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            first.addLast(sc.nextDouble());

        for (int i = 0; i < 5; i++)
            second.addLast(sc.nextDouble());

        int cnt = 0;
        while (true) {
            if (cnt == 106) {
                System.out.println("botva");
                return;
            }

            if (first.isEmpty()) break;
            double card1 = first.pollFirst();
            if (second.isEmpty()) break;
            double card2 = second.pollFirst();

            cnt++;
            if (!(card1 == 9 && card2 == 0) && (card1 > card2 || (card1 == 0 && card2 == 9))) {
                first.addLast(card1);
                first.addLast(card2);
            } else {
                second.addLast(card1);
                second.addLast(card2);
            }
        }

        System.out.println((first.isEmpty() ? "second " : "first ") + cnt);
    }
}
