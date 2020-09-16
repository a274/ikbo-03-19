package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // лабы
        Task1 task1 = new Task1();
        task1.doThis();

        Task2 task2 = new Task2();
        task2.doThis(args);

        Task3 task3 = new Task3();
        task3.doThis();

        Task4 task4 = new Task4();
        task4.doThis();

        task5();
        //практика
        Test test = new Test();
        test.doThis();
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task 5\nEnter a number: ");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
