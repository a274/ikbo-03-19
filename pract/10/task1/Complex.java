package com.company.task1;

public class Complex {
    private int Re;
    private int Im;

    public Complex(){}
    public Complex(int re, int im) {
        Re = re;
        Im = im;
    }
    @Override
    public String toString() {
        return Re + " + " + Im + "i";
    }
}
