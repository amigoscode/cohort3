package com.helenatech.wedweektwo.inheritancedogsandcats;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, String color, int age, int numberOfLegs, String breed) {
        super(name, color, age, numberOfLegs);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is barking%n", this.getName());
    }

}
