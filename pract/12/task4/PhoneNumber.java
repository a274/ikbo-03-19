package com.company.task4;

public class PhoneNumber {
    private String number;

    public PhoneNumber(String input) {
        if (input.charAt(0) == '+') {
            number = input.substring(0, 5) + "-" + input.substring(5, 8) + "-" + input.substring(8, 12);
        } else if (input.charAt(0) == '8') {
            number = "+7" + input.substring(1, 4) + "-" + input.substring(4, 7) + "-" + input.substring(7, 11);
        }
    }

    @Override
    public String toString() {
        return number;
    }
}
