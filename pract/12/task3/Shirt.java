package com.company.task3;

public class Shirt {
    private String article, type, color, size;

    public Shirt(String s) {
        String[] str = s.split(",");
        article = str[0];
        type = str[1];
        color = str[2];
        size = str[3];
    }

    @Override
    public String toString() {
        return String.format("%s - article\n%s - type\n%s - color\n%s - size", article, type, color, size);
    }
}
