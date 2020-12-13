package com.company.task2;

public class Test {
    public static void main(String[] args) {
        Address address1 = new Address("a,b,c,d,e,f,j");
        System.out.println(address1); // a b c d e f j

        Address address2 = new Address("a10b10c10d10e10f10j1", "0");
        System.out.print(address2); // a1 b1 c1 d1 e1 f1 j1
    }
}
