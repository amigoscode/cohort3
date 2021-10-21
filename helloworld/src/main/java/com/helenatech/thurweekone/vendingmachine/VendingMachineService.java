package com.helenatech.thurweekone.vendingmachine;

public class VendingMachineService {

    public int addItem(VendingMachine machine, Item item) {
        // check capacity
        // put item
        // increment count
        if (machine.getCount() + 1 <= machine.getCapacity()) {
            Item[] items = machine.getItems();
            items[machine.getCount()] = item;
            int count = machine.getCount();
            machine.setCount(++count);
            return 1;
        }
        return 0;
    }
}
