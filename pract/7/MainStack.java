package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MainStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> first = new ArrayDeque<>(10);
        ArrayDeque<Integer> second = new ArrayDeque<>(10);

        ArrayDeque<Integer> firstSup = new ArrayDeque<>(10);
        ArrayDeque<Integer> secondSup = new ArrayDeque<>(10);

        for (int i = 0; i < 5; i++)
            firstSup.addFirst(sc.nextInt());

        for (int i = 0; i < 5; i++)
            secondSup.addFirst(sc.nextInt());

        while (!firstSup.isEmpty()){
            first.addFirst(firstSup.pollFirst());
            second.addFirst(secondSup.pollFirst());
        }


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

            if (!(card1 == 9 && card2 == 0) && (card1 > card2 || (card1 == 0 && card2 == 9)))
                addLastInStack(first, firstSup, card1, card2);
            else
                addLastInStack(second, secondSup, card1, card2);
        }

        System.out.println((first.isEmpty() ? "second " : "first ") + cnt);
    }

    private static void addLastInStack(ArrayDeque<Integer> stack, ArrayDeque<Integer> stackSup, int card1, int card2) {
        while (!stack.isEmpty())
            stackSup.addFirst(stack.pollFirst());

        stack.addFirst(card2);
        stack.addFirst(card1);

        while (!stackSup.isEmpty())
            stack.addFirst(stackSup.pollFirst());
    }
}