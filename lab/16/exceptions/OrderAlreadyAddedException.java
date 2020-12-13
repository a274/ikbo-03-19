package com.company.exceptions;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String errorMessage) {
        super(errorMessage);
    }
}

