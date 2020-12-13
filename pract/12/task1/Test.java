package com.company.task1;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Petrov", "Ivan", "Ivanovich");
        Person person2 = new Person("Smirnov");
        System.out.println(person1.formattedName() + "\n" + person2.formattedName());
    }
}
