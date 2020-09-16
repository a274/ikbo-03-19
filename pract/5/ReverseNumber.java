package com.company;

import java.util.Scanner;

public class ReverseNumber {
    private int res = 0;
    public ReverseNumber() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num + " " + rec(num));
    }

    public ReverseNumber(int n) {
        System.out.println(n + " " + rec(n));
    }

    private int rec(int n) {
        if (n == 0) return res;
        res = res * 10 + n % 10;
        return rec(n/10);
    }
}
