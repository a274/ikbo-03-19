package com.company.task2;

import com.company.task1.Student;

public class Test2 {
    public static void main(String[] args) {
        int N = 50;
        Student[] students = new Student[N];

        System.out.println("Given array:");
        for (int i = 0; i < N; i++) {
            students[i] = new Student();
            System.out.print(students[i].getGrade() + " ");
        }
        System.out.println("\nSorted array:");
        SortingStudentsByGPA s = new SortingStudentsByGPA();
        s.quickSort(students, 0, students.length-1);
        for (Student student : students) {
            System.out.print(student.getGrade() + " ");
        }
    }
}
