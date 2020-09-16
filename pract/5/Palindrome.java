package com.company;

import java.util.Scanner;

public class Palindrome {
    private String word;
    private int l;

    public Palindrome() {
        Scanner scanner = new Scanner(System.in);
        word = scanner.next();
        l = word.length();
        System.out.println(word + " " + (rec(l/2) ? "YES" : "NO"));
    }

    public Palindrome(String test) {
        word = test;
        l = word.length();
        System.out.println(word + " " + (rec(l/2) ? "YES" : "NO"));
    }

    private boolean rec(int n) {
        if (n == 0) return true;
        if (word.charAt(n) == word.charAt(l - n - 1)) return rec(n -1);
        else return false;
    }
}
