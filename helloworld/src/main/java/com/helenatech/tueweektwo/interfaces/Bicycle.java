package com.helenatech.tueweektwo.interfaces;

public class Bicycle implements Vehicle {
    private String brand;
    private int speed;

    public Bicycle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public void move(int speed) {
        System.out.println("pedal");
        this.speed += speed;
    }

    @Override
    public void applyBreaks() {
        System.out.println("hand break");
        this.speed = 0;
    }
}
