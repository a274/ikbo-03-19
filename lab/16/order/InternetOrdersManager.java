package com.company.order;

import com.company.food_related.MenuItem;

import java.util.ArrayList;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public InternetOrdersManager(int size) {
        this.size = size;
        head = new QueueNode(null);
        tail = new QueueNode(head, null, null);
    }

    public boolean add(Order order) {
        tail = tail.next;
        tail = new QueueNode(tail.prev, order, null);
        return true;
    }

    public Order remove() {
        Order temp = tail.value;
        tail = tail.prev;
        tail.next = null;
        return temp;
    }

    public Order order() {
        return head.value;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int cnt = 0;
        QueueNode temp = head;
        while (temp != tail) {
            MenuItem[] items = temp.value.getItems();
            for (int i = 0; i < items.length; i++) {
                if (items[i].getName().equals(itemName)) cnt++;
            }
            temp = temp.next;
        }
        return cnt;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Order[] getOrders() {
        ArrayList array = new ArrayList();
        QueueNode temp = head;
        while (temp != tail){
            array.add(temp.value);
            temp = temp.next;
        }
        Order[] arr = new Order[array.size()];
        for (int i = 0; i < arr.length; i++) arr[i] = (Order) array.get(i);
        return arr;
    }

    @Override
    public double ordersCostSummary() {
        double sum = 0;
        QueueNode temp = head;
        while (temp != tail){
            MenuItem[] items = temp.value.getItems();
            for (int i = 0; i < items.length; i++)
                sum += items[i].getCost();
            temp = temp.next;
        }
        return sum;
    }

    @Override
    public int ordersQuantity() {
        return getOrders().length;
    }
}
