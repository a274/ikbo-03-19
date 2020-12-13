package com.company.order;

import com.company.food_related.MenuItem;

public class ListNode {
    MenuItem item;
    ListNode next;
    ListNode previous;

    ListNode(MenuItem item) {
        this(null, item, null);
    }

    ListNode(ListNode previous, MenuItem item, ListNode next) {
        this.item = item;
        this.next = next;
        this.previous = previous;
    }
}