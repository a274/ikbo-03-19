package com.company;

import java.util.Scanner;

public class Task1 {

    public void doThis() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task 1\nEnter array capacity: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumFor(arr) + " " + sumWhile(arr) + " " + sumDoWhile(arr));
    }

    public int sumFor(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int sumWhile(int[] arr) {
        int sum = 0;
        int len = arr.length - 1;
        while (len >= 0) {
            sum += arr[len];
            len--;
        }
        return sum;
    }

    public int sumDoWhile(int[] arr) {
        int sum = 0;
        int len = arr.length - 1;
        do {
            sum += arr[len];
            len--;
        } while (len >= 0);
        return sum;
    }
}
