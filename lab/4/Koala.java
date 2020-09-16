package com.company;

public class Koala implements Nameable {
    private String name;

    public Koala(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
