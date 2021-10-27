package com.helenatech.wedweektwo.ds;

import com.helenatech.wedweektwo.inheritancedogsandcats.Dog;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> waitrose = new LinkedList<>();
        waitrose.add(new Person()); // Darania
        waitrose.add(new Person()); // Oliver
        waitrose.add(new Person()); // Tamara

        waitrose.poll();
        waitrose.offer(new Person());

    }

    static class Person {}

    private static void stacks() {
        Stack<Pringles> pringles = new Stack<>();
        pringles.push(new Pringles());
        pringles.push(new Pringles());
        pringles.push(new Pringles());
        pringles.push(new Pringles());

        boolean empty = pringles.empty();
        Pringles peek = pringles.peek();
        Pringles pop = pringles.pop();

        System.out.println(pringles.size());
    }

    static class Pringles {}

    private static void maps() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Luke");
        map.put(2, "Jordan");
        map.put(3, "Laiba");


        String value = map.get(1);
        String does_not_exists = map.getOrDefault(99, "does not exists");
        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }

    private static void listsAndGenerics() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        numbers.add(2, 0);
        boolean contains = numbers.contains(1);
        System.out.println(numbers);
    }

    // method overloading
    public static void foo() {}
    public static void foo(int a) {}
    public static void foo(int a, int b) {}
}
