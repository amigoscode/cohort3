package com.helenatech.wedweektwo.inheritancedogsandcats;

public class Main {
    public static void main(String[] args) {
        // we cannot instantiate Animal because of the abstract keyword
//        Animal animal = new Animal("name", "color", 2, 2);

        Cat cat = new Cat("Thumbs", "BLACK", 1, 4);
        Cat cat2 = new Cat("asdsa", "das", 1, 4);
        Dog dog = new Dog("Bobby", "BROWN", 14, 4, "Husky");

        takeAnimal(cat);
        takeAnimal(dog);

    }

    public static void takeAnimal(Animal animal) {
        System.out.println(animal);
        animal.makeSound();
    }

}
