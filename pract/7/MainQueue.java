package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;
// 1
public class MainQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> first = new ArrayDeque<>(10);
        ArrayDeque<Integer> second = new ArrayDeque<>(10);

        for (int i = 0; i < 5; i++)
            first.addLast(sc.nextInt());

        for (int i = 0; i < 5; i++)
            second.addLast(sc.nextInt());

        int cnt = 0;
        while (true) {
            if (cnt == 106) {
                System.out.println("botva");
                return;
            }

            if (first.isEmpty()) break;
            if (second.isEmpty()) break;

            cnt++;
            int card1 = first.pollFirst();
            int card2 = second.pollFirst();
            //System.out.print(card1 + " " + card2);

            if (!(card1 == 9 && card2 == 0) && (card1 > card2 || (card1 == 0 && card2 == 9))) {
                first.addLast(card1);
                first.addLast(card2);
                //System.out.println(": these cards go to first");
            } else {
                second.addLast(card1);
                second.addLast(card2);
                //System.out.println(": these cards go to second");
            }
        }

        System.out.println((first.isEmpty() ? "second " : "first ") + cnt);
    }
}
