package com.company.order;

import com.company.customer.Address;
import com.company.customer.Customer;
import com.company.food_related.MenuItem;

import java.util.Arrays;
import java.util.Comparator;

public class TableOrder implements Order {
    private int size;
    private MenuItem[] items;
    private int cnt = 0;

    public TableOrder(int size) {
        this.size = size;
        items = new MenuItem[size];
    }

    @Override
    public boolean add(MenuItem item) {
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
    public MenuItem[] getItems() {
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

    Comparator<MenuItem> comparator = Comparator.comparing(obj -> obj.getCost());

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items1 = items;
        Arrays.sort(items1, comparator);
        return items1;
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {
        int count = 0;
        for (int i = 0; i <= cnt; i++) {
            if (items[i].equals(itemName)) count++;
        }
        return count;
    }

    @Override
    public boolean remove(MenuItem item) {
        for (int i = 0; i <= cnt; i++) {
            if (items[i].equals(item)) {
                for (int j = i; j < cnt; j++) {
                    items[j] = items[j + 1];
                }
                cnt--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(MenuItem item) {
        int counter = 0;
        for (int i = 0; i <= cnt; i++) {
            if (items[i].equals(item)) {
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
    public Customer getCustomer() {
        return new Customer("Ivan", "Ivanov", 20, new Address("Moscow", 123456, "Tverskaya", 1, 'c', 1));
    }

    @Override
    public void setCustomer(Customer customer) {
    }
}
