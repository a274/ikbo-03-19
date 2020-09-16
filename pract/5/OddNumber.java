package com.company;

import java.util.Scanner;

public class OddNumber {

    public OddNumber() {
        rec();
    }

    private void rec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) return;
        if (n % 2 == 1) System.out.println(n);
        rec();
    }
}
