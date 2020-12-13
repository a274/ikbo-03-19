package com.company;

public class ListNode {
    Item item;
    ListNode next;
    ListNode previous;

    ListNode(Item item) {
        this(null, item, null);
    }

    ListNode(ListNode previous, Item item, ListNode next) {
        this.item = item;
        this.next = next;
        this.previous = previous;
    }
}