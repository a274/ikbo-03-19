package com.company;

public class Main {

    public static void main(String[] args) {
        new Palindrome("abba"); //8
        new Palindrome("radar");
        new Palindrome("word");
        System.out.println("-------------------");

        new WithoutNought(0, 17); //9
        new WithoutNought(1, 19);
        new WithoutNought(12, 0);
        new WithoutNought(12, 15);
        System.out.println("-------------------");

        new ReverseNumber(1234); //10
        System.out.println("-------------------");

        new CountOne(); // 11
        System.out.println("-------------------");

        new OddNumber(); // 12
        System.out.println("-------------------");
    }

}
