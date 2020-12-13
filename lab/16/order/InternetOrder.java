package com.company.order;

import com.company.customer.Address;
import com.company.customer.Customer;
import com.company.food_related.MenuItem;

import java.util.Arrays;
import java.util.Comparator;

public class InternetOrder implements Order {
    private ListNode order;
    private int count;

    public InternetOrder() {
        order = null;
    }

    public InternetOrder(MenuItem[] items) {
        for (MenuItem item : items) {
            count++;
            add(item);
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public boolean add(MenuItem item) {
        try {
            if (isEmpty())
                order = new ListNode(item);
            else {
                ListNode temp = order;
                order = new ListNode(null, item, temp);
                order.next.previous = order;
            }
            count++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean remove(String name) {
        if (isEmpty()) return false;
        if (order.item != null) {
            if (order.item.getName().equals(name)) {
                order = order.next;
                return true;
            }
        }

        ListNode current = order;
        boolean flag = true;

        while (flag) {
            current = current.next;
            if (current == null) {
                flag = false;
            } else if (current.item != null) {
                if (current.item.getName().equals(name)) {
                    flag = false;
                }
            }
        }
        if (current == null) return false;
        if (current.next != null)
            current.next.previous = current.previous;
        current.previous.next = current.next;
        count--;
        return true;
    }

    public int removeAll(String name) {
        boolean flag = true;
        int cnt = 0;
        while (flag) {
            if (!remove(name)) {
                flag = false;
            }
            else cnt++;
        }
        return cnt;
    }

    public int itemsQuantity() {
        return count;
    }

    public double costTotal() {
        double cost = 0;
        if (!isEmpty()) {
            ListNode temp = order;
            while (temp != null) {
                if (temp.item != null) {
                    cost += temp.item.getCost();
                }
                temp = temp.next;
            }
        }
        return cost;
    }

    public double costTotal(String s) {
        double cost = 0;
        if (!isEmpty()) {
            ListNode temp = order;
            while (temp != null) {
                if (temp.item != null) {
                    if (temp.item.getName().equals(s)) ;
                    cost += temp.item.getCost();
                }
                temp = temp.next;
            }
        }
        return cost;
    }

    public int itemsQuantity(String name) {
        int quantity = 0;
        if (!isEmpty()) {
            ListNode temp = order;
            while (temp != null) {
                if (temp.item != null) {
                    if (temp.item.getName().equals(name)) {
                        quantity++;
                    }
                }
                temp = temp.next;
            }
        }
        return quantity;
    }

    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[count];
        ListNode t = order;
        for (int i = 0; i < count; i++) {
            items[i] = t.item;
            t = t.next;
        }
        return items;
    }

    Comparator<MenuItem> comparator = Comparator.comparing(MenuItem::getCost);
    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();
        Arrays.sort(items, comparator);
        return items;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[count];
        ListNode t = order;
        for (int i = 0; i < count; i++) {
            names[i] = t.item.getName();
            t = t.next;
        }
        return names;
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {
        return itemsQuantity(itemName.getName());
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public Customer getCustomer() {
        return new Customer("Ivan", "Ivanov", 20, new Address("Moscow", 123456, "Tverskaya", 1, 'c', 1));
    }

    @Override
    public void setCustomer(Customer customer) {

    }
}
