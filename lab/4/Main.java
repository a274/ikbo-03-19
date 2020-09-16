package com.company;

public class Main {

    public static void main(String[] args) {
        Koala koala = new Koala("Oleg");
        Car car = new Car("Lada");
        print(koala);
        print(car);
    }

    public static void print(Nameable nameable) {
        System.out.println(nameable.getName());
    }
}
