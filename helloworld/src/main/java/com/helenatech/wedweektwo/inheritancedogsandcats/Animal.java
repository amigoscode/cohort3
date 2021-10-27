package com.helenatech.wedweektwo.inheritancedogsandcats;

public abstract class Animal {
    protected String name;
    private String color;
    private int age;
    private int numberOfLegs;

//    "LAIBA", "WHITE", 20, 2
    public Animal(String name, String color, int age, int numberOfLegs) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
