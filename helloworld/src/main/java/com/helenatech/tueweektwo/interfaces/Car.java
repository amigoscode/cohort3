package com.helenatech.tueweektwo.interfaces;

public class Car implements Vehicle {

    private String brand;
    private int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public void move(int speed) {
        System.out.println("check mirrors");
        System.out.println("change gears");
        System.out.println("press accelerator");
        this.speed += speed;
    }

    @Override
    public void applyBreaks() {
        System.out.println("check mirrors");
        System.out.println("pedal break");
        System.out.println("change gears");
        System.out.println("hand break");
        this.speed = 0;
    }
}
