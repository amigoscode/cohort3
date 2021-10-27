package com.helenatech.wedweektwo.inheritancedogsandcats;

public class Cat extends Animal {

    public Cat(String name, String color, int age, int numberOfLegs) {
        super(name, color, age, numberOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is meowing%n", this.name);
    }

    public void purr() {
        System.out.printf("%s is purring%n", this.getName());
    }
}
