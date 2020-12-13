package com.company.order;

import com.company.exceptions.IllegalTableNumber;
import com.company.exceptions.OrderAlreadyAddedException;
import com.company.food_related.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;

public class TableOrdersManager implements OrdersManager {
    private final int N = 100;
    private Order[] orders = new Order[N];
    private HashMap<String, Order> addressBook;

    public TableOrdersManager() {
        for (int i = 0; i < N; i++) orders[i] = null;
    }

    public void add(Order order, int tableNumber) throws OrderAlreadyAddedException {
        if (tableNumber < N) throw new IllegalTableNumber("There is no table with number " + tableNumber);
        if (orders[tableNumber] != null)
            throw new OrderAlreadyAddedException("Order already added to the table " + tableNumber);
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

    public void addItem(MenuItem item, int tableNumber) {
        if (tableNumber < N) throw new IllegalTableNumber("There is no table with number " + tableNumber);
        orders[tableNumber].add(item);
    }

    public void addItem(String address, MenuItem item) {
        Order order = addressBook.get(address);
        order.add(item);
    }

    public void removeOrder(int tableNumber) {
        if (tableNumber < N) throw new IllegalTableNumber("There is no table with number " + tableNumber);
        orders[tableNumber] = null;
    }

    public int remove(Order order) {
        for (int i = 0; i < N; i++) {
            if (orders[i].equals(order)) orders[i] = null;
            return i;
        }
        return -1;
    }

    public int removeAll(Order order) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (orders[i].equals(order)) orders[i] = null;
            count++;
        }
        return count;
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

    @Override
    public int ordersQuantity() {
        ArrayList array = new ArrayList();
        for (int i = 0; i < N; i++) {
            if (orders[i] != null) array.add(orders[i]);
        }
        return array.size();
    }

    public Order[] getOrders() {
        ArrayList array = new ArrayList();
        for (int i = 0; i < N; i++) {
            if (orders[i] != null) array.add(orders[i]);
        }
        Order[] arr = new Order[array.size()];
        for (int i = 0; i < arr.length; i++) arr[i] = (Order) array.get(i);
        return arr;
    }

    public double ordersCostSummary() {
        double sum = 0;
        for (int i = 0; i < N; i++) {
            if (orders[i] == null) continue;
            sum += orders[i].costTotal();
        }
        return sum;
    }

    public int itemsQuantity(String itemName) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (orders[i] == null) continue;
            MenuItem[] menuItems = orders[i].getItems();
            int orderSize = menuItems.length;
            for (int j = 0; j < orderSize; j++) {
                if (menuItems[i].getName().equals(itemName)) sum++;
            }
        }
        return sum;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (orders[i] == null) continue;
            MenuItem[] menuItems = orders[i].getItems();
            int orderSize = menuItems.length;
            for (int j = 0; j < orderSize; j++) {
                if (menuItems[i].getName().equals(item.getName())) sum++;
            }
        }
        return sum;
    }
}
