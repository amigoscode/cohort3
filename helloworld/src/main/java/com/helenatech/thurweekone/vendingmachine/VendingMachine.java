package com.helenatech.thurweekone.vendingmachine;

import java.util.Arrays;
import java.util.Objects;

public class VendingMachine {

    private Item[] items;
    private int capacity;
    private int count;
    private String color;

    public VendingMachine(int capacity, int count) {
        this.items = new Item[capacity];
        this.capacity = capacity;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "items=" + Arrays.toString(items) +
                ", capacity=" + capacity +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendingMachine that = (VendingMachine) o;
        return capacity == that.capacity && count == that.count && Arrays.equals(items, that.items) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, count, color);
        result = 31 * result + Arrays.hashCode(items);
        return result;
    }
}
