package com.company.task1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ConcreteFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex();
        Complex complex2 = factory.CreateComplex(12, 2);
        System.out.println(complex1 + "\n" + complex2);
    }
}
