package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public void doThis() {
        System.out.println("Task 4\nEnter array capacity: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random();
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
