package com.company;

import java.util.Scanner;

public class WithoutNought {

    public WithoutNought() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(rec(a, b));
    }

    public WithoutNought(int a, int b) {
        System.out.println(rec(a, b));
    }

    private int rec(int a, int b) {
        if (a == 0) return 1;
        if (a == 1) return b + 1;
        if (a > 1 && b == 0) return 0;
        else return rec(a - 1, b - 1) + rec(a, b - 1);
    }

}
