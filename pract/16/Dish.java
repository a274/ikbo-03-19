package com.company;

public class Dish implements Item {
    private final double cost;
    private final String name;
    private final String description;

    public Dish(String name, String description) {
        if (name.equals("") || description.equals("")) throw new IllegalArgumentException();
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Dish(int cost, String name, String description) {
        if (cost < 0 || name.equals("") || description.equals("")) throw new IllegalArgumentException();
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
