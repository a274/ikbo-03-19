package com.company;

public class FurnitureShop {
    public static void main(String[] args) {
        // write your code here
        Sofa sofa = new Sofa(10, 10, 10, "cotton", 4);
        sofa.displayInfo();
        Wardrobe wardrobe = new Wardrobe(5, 5, 4, "wood", 10);
        wardrobe.displayInfo();
    }
}
