package com.company.task1;

import com.company.task2.SortingStudentsByGPA;

public class Test {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int N = 50;
        Student[] students = new Student[N];
        int[] iDNumber = new int[N];

        System.out.println("Given array:");
        for (int i = 0; i < N; i++) {
            students[i] = new Student();
            iDNumber[i] = students[i].getId();
            System.out.print(iDNumber[i] + " ");
        }
        System.out.println("\nSorted array:");
        insertionSort(iDNumber);
        for (int id : iDNumber) {
            System.out.print(id + " ");
        }
    }
}
