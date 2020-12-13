package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class RestaurantOrder implements Order {
    private int size;
    private Item[] items;
    private int cnt = 0;

    public RestaurantOrder(int size) {
        this.size = size;
        items = new Item[size];
    }

    public boolean add(Item item) {
        if (cnt >= size) return false;
        items[cnt] = item;
        cnt++;
        return true;
    }

    public boolean remove(String itemName) {
        for (int i = 0; i <= cnt; i++) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < cnt; j++) {
                    items[j] = items[j + 1];
                }
                cnt--;
                return true;
            }
        }
        return false;
    }

    public int removeAll(String itemName) {
        int counter = 0;
        for (int i = 0; i <= cnt; i++) {
            if (items[i].getName().equals(itemName)) {
                counter++;
                for (int j = i; j < cnt; j++) {
                    items[j] = items[j + 1];
                }
                cnt--;
            }
        }
        return counter;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int counter = 0;
        for (int i = 0; i <= cnt; i++)
            if (items[i].getName().equals(itemName)) counter++;
        return counter;
    }

    @Override
    public Item[] getItems() {
        return items;
    }

    @Override
    public double costTotal() {
        double costTotal = 0;
        for (int i = 0; i <= cnt; i++) {
            costTotal += items[i].getCost();
        }
        return costTotal;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[cnt + 1];
        for (int i = 0; i <= cnt; i++) {
            names[i] = items[i].getName();
        }
        return names;
    }

    Comparator<Item> comparator = Comparator.comparing(obj -> obj.getCost());
    @Override
    public Item[] sortedItemsByCostDesc() {
        Item[] items1 = items;
        Arrays.sort(items1, comparator);
        return items1;
    }
}
