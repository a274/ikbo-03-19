package com.company;

import java.util.Scanner;

public class CountOne {

    public CountOne() {
        System.out.println(rec());
    }

    private int rec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) return rec() + n;
        if (n == 0) {
            int a = sc.nextInt();
            if (a == 0) return n;
            if (a == 1) return rec() + a;
            else return rec();
        }
        else return rec();
    }
}