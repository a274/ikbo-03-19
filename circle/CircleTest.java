package com.company;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle1 = new Circle(10, 0, 0);
        System.out.println(circle1);

        Circle circle2 = new Circle();
        circle2.setRadius(5);
        circle2.setX(2);
        circle2.setY(4);
        System.out.println(circle2);
    }
}
