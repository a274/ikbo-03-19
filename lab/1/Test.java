package com.company;

public class Test {
    public void doThis() {
        Book book = new Book(1, "a", "a", "a", 1);
        System.out.println(book.toString());

        Ball ball = new Ball(1, "a", "a");
        System.out.println(ball.toString());

        Dog dog = new Dog("a", 1, 1, 1, "a");
        System.out.println(dog.toString());
    }
}
