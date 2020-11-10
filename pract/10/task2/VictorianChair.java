package com.company.task2;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(){}
    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Victorian Chair";
    }
}
