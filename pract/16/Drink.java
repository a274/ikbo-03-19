package com.company;

public final class Drink implements Item {
    private final double cost;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        if (name.equals("") || description.equals("")) throw new IllegalArgumentException();
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Drink(int cost, String name, String description) {
        if (cost < 0 || name.equals("") || description.equals("")) throw new IllegalArgumentException();
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
