package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderManager {
    private final int N = 100;
    private Order[] orders = new Order[N];
    private HashMap<String, Order> addressBook;

    public OrderManager() {
        for (int i = 0; i < N; i++) orders[i] = null;
    }

    public void add(Order order, int tableNumber) throws OrderAlreadyAddedException {
        if (tableNumber < N) throw new IllegalTableNumber("There is no table with number " + tableNumber);
        if (orders[tableNumber] != null) throw new OrderAlreadyAddedException("Order already added to the table " + tableNumber);
        orders[tableNumber] = order;
    }

    public void add(String address, Order order) {
        addressBook.put(address, order);
    }

    public Order getOrder(int tableNumber) {
        if (tableNumber < N) throw new IllegalTableNumber("There is no table with number " + tableNumber);
        return orders[tableNumber];
    }

    public Order getOrder(String address) {
        return addressBook.get(address);
    }

    public void addItem(Item item, int tableNumber) {
        if (tableNumber < N) throw new IllegalTableNumber("There is no table with number " + tableNumber);
        orders[tableNumber].add(item);
    }

    public void addItem(String address, Item item) {
        Order order = addressBook.get(address);
        order.add(item);
    }

    public void removeOrder(int tableNumber) {
        if (tableNumber < N) throw new IllegalTableNumber("There is no table with number " + tableNumber);
        orders[tableNumber] = null;
    }

    public void removeOrder(String address) {
        addressBook.remove(address);
    }

    public int freeTableNumber() {
        for (int i = 0; i < N; i++) {
            if (orders[i] == null) return i;
        }
        return -1;
    }
    public int[] freeTableNumbers() {
        ArrayList array = new ArrayList();
        for (int i = 0; i < N; i++) {
            if (orders[i] == null) array.add(i);
        }
        int[] arr = new int[array.size()];
        for (int i = 0; i < arr.length; i++) arr[i] = (int) array.get(i);
        return arr;
    }

    public Order[] getOrders() {
        return orders;
    }

    public double ordersCostSummary() {
        double sum = 0;
        for (int i = 0; i < N; i++) {
            if (orders[i] == null) continue;
            sum += orders[i].costTotal();
        }
        return sum;
    }

    public int itemQuantity(String itemName) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (orders[i] == null) continue;
            sum += orders[i].itemsQuantity(itemName);
        }
        return sum;
    }
}
