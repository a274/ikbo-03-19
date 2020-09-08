package com.company;

public class Wardrobe extends Furniture{
    private int numberOfShelves;

    public Wardrobe(int weight, int height, int weigh, String material, int numberOfShelves) {
        super(weight, height, weigh, material);
        this.numberOfShelves = numberOfShelves;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Wardrobe parameters:%n weight - %d,%n height - %d,%n weigh - %d,%n material - %s,%n number of shelves - %d%n", getWeight(), getHeight(), getWeigh(), getMaterial(), numberOfShelves);
    }
}
