package com.company;

public abstract class Furniture {
    private int weight;
    private int height;
    private int weigh;
    private String material;

    public Furniture(int weight, int height, int weigh, String material) {
        this.weight = weight;
        this.height = height;
        this.weigh = weigh;
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public abstract void displayInfo();
}
