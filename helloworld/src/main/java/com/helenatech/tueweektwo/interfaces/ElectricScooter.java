package com.helenatech.tueweektwo.interfaces;

public class ElectricScooter {
    private String brand;
    private int speed;

    public void move(int speed) {
        this.speed += speed;
    }

    public void applyBreaks() {
        this.speed = 0;
    }
}
