package com.company;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(String errorMessage) {
        super(errorMessage);
    }
}