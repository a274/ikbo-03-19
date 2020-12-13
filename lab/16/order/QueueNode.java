package com.company.order;

public class QueueNode {
    Order value;
    QueueNode next;
    QueueNode prev;

    QueueNode(Order order) {
        this(null, order, null);
    }

    QueueNode(QueueNode previous, Order order, QueueNode next) {
        this.value = order;
        this.next = next;
        this.prev = previous;
    }
}
