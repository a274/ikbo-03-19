package com.company.exceptions;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(String errorMessage) {
        super(errorMessage);
    }
}