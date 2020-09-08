package com.company;

public class Sofa extends Furniture{
    private int numberOfPillows;

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

    public void setNumberOfPillows(int numberOfPillows) {
        this.numberOfPillows = numberOfPillows;
    }

    public Sofa(int weight, int height, int weigh, String material, int numberOfPillows) {
        super(weight, height, weigh, material);
        this.numberOfPillows = numberOfPillows;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Sofa parameters:%n weight - %d,%n height - %d,%n weigh - %d,%n material - %s,%n number of pillows - %d%n", getWeight(), getHeight(), getWeigh(), getMaterial(), numberOfPillows);
    }
}
