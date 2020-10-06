package com.company.task3;

import com.company.task1.Student;

public class Test3 {
    public static void merge(Student arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        Student L[] = new Student[n1];
        Student R[] = new Student[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getGrade() <= R[j].getGrade()) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(Student arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static Student[] mergeSort(Student[] students1, Student[] students2) {
        int size = students1.length + students2.length;
        Student[] arr = new Student[size];
        int i, s2 = students2.length;
        for (i = 0; i < students1.length; i++)
            arr[i] = students1[i];

        for (; i < size; i++)
            arr[i] = students2[i - s2];

        sort(arr, 0, size - 1);
        return arr;
    }

    public static void main(String[] args) {
        int N = 5;
        Student[] students1 = new Student[N];
        Student[] students2 = new Student[N];

        for (int i = 0; i < N; i++) {
            students1[i] = new Student();
            students2[i] = new Student();
        }

        for (Student student : students1)
            System.out.print(student.getGrade() + " ");
        System.out.println();
        for (Student student : students2)
            System.out.print(student.getGrade() + " ");

        System.out.println("\n\nMerged and sorted array:");
        Student[] sortedArray = mergeSort(students1, students2);
        for (Student student : sortedArray)
            System.out.print(student.getGrade() + " ");
    }
}
