package com.company.food_related;

public final class Dish extends MenuItem {
    public Dish(String name, String description) {
        super(name, description);
    }

    public Dish(int cost, String name, String description) {
        super(cost, name, description);

    }
}
