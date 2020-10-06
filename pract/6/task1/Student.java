package com.company.task1;

import java.util.Random;

public class Student {
    private final int id;
    private final int grade;

    public Student() {
        Random random = new Random();
        this.id = random.nextInt(1000);
        this.grade = random.nextInt(101);
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("id: %d, grade: %d", id, grade);
    }
}
