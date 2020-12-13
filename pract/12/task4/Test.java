package com.company.task4;

public class Test {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber("+79175655655");
        System.out.println(phoneNumber);

        phoneNumber = new PhoneNumber("+104289652211");
        System.out.println(phoneNumber);

        phoneNumber = new PhoneNumber("89175655655");
        System.out.println(phoneNumber);
    }
}
