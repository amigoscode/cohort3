package com.helenatech.thurweektwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

    }

    private static void groupingAndCounting() {
        Function<String, String> stringStringFunction = letter -> letter.toUpperCase();
        Predicate<String> predicate = letter -> !letter.equals("z");

        Map<String, Long> map = List.of("a", "a", "c", "d", "d", "d", "z")
                .stream()
                .filter(predicate)
                .map(stringStringFunction)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }

    private static void streams() {
        List<Person> people = List.of(
                new Person("Smith", Gender.FEMALE),
                new Person("Anna", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Oliver", Gender.MALE)
        );

        List<String> females = people.stream()
                .filter(p -> p.gender.equals(Gender.FEMALE))
                .map(p -> p.name)
                .map(name -> name.toUpperCase())
                .limit(1)
                .collect(Collectors.toList());

        females.forEach(System.out::println);
    }

    private static void imperativeProgramming() {
        List<Person> people = List.of(
                new Person("Smith", Gender.FEMALE),
                new Person("Anna", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Oliver", Gender.MALE)
        );

        List<Person> female = new ArrayList<>();

        people.forEach(person -> {
            var isGender = person.gender.equals(Gender.FEMALE);
            if (isGender) {
                female.add(person);
            }
        });

        female.forEach(System.out::println);
    }

    public static class Person {
        String name;
        Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    public static enum Gender {
        MALE, FEMALE, OTHER
    }
}
