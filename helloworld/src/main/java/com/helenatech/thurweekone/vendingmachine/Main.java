package com.helenatech.thurweekone.vendingmachine;

public class Main {
    public static void main(String[] args) {
        Item marmite = new Item("Marmite Walkers", 2.96);
        Item marmite2 = new Item("Marmite Walkers", 2.96);

        System.out.println(marmite.equals(marmite2)); // true
        System.out.println(marmite == marmite2); // false

    }

    private static void objects() {
        Item twix = new Item("twix", 0.96);
        Object walkers = new Item("salt and vinegar", 0.96);

        System.out.println(twix);
        System.out.println(walkers);
    }

    private static void vendingMachine() {
        Item twix = new Item("twix", 0.96);
        Item walkers = new Item("salt and vinegar", 0.96);
        Item[] items = {twix};

        VendingMachine vendingMachine = new VendingMachine(50, 0);
        VendingMachineService vendingMachineService = new VendingMachineService();

        for (Item item : items) {
            int result = vendingMachineService.addItem(vendingMachine, item);
            System.out.println(result);
        }
    }
}
