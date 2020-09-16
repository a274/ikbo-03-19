package com.company;

public class Ball {
    private int radius;
    private String brand;
    private String material;

    public Ball(){}

    public Ball(int radius, String brand, String material) {
        this.radius = radius;
        this.brand = brand;
        this.material = material;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
