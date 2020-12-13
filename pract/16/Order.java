package com.company;

public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int itemsQuantity();
    Item[] getItems();
    Item[] sortedItemsByCostDesc();
    double costTotal();
    int itemsQuantity(String itemName);
    String[] itemsNames();
    //int itemsQuantity(Item itemName);
    //boolean remove(Item item);
    //int removeAll(Item item);

}
