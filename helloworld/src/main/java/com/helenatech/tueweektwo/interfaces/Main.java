package com.helenatech.tueweektwo.interfaces;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Canondale", 0);
        Car car = new Car("Tesla", 0);

        Vehicle[] vehicles = {bicycle, car};

        Person person = new Person("Luke", vehicles);

    }
}


















