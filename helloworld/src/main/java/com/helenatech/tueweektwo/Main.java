package com.helenatech.tueweektwo;

import java.awt.*;
import java.io.*;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer number = 0;
        Integer result = foo(number);

        Point point = new Point(10, 10);

        System.out.println(number);
        System.out.println(result);
    }

    static Integer foo(int n) {
        n++;
        return n;
    }

    private static void workingWithFiles() {
        File file = new File("src/foo.txt");

        if (!file.exists()) {
            try {
                System.out.println(file.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists");
        }

        try {
            FileWriter fileWriter = new FileWriter(file, true);

            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Foo");
            printWriter.println("Bar");

            printWriter.flush();
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void optionals() {
        Optional<String> optional = Optional.ofNullable("Foo");

        String defaultValue = optional.orElse("Bar");
        String optional_cannot_be_null = optional
                .orElseThrow(() -> new IllegalStateException("optional cannot be null"));

        System.out.println(defaultValue);

        Person person = new Person("Foo", "Bar");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getMiddleName().orElse("Not provided"));
    }

    static void rashid(int n) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("");
    }

    static void luke() throws FileNotFoundException {
        rashid(-1);
    }

    static void tamara() throws FileNotFoundException {
        luke();
    }

    private static void typesOfException() {
        // Runtime Exception
        for (int i = 10; i >= 0; i--) {
            try {
                System.out.println(10 / i);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide 10 by " + i);
            }
        }

        // Checked Exception
        File file = new File("/src/hello.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("oops file does not exists");
        } catch (ArithmeticException e) {

        } catch (NullPointerException e) {

        } finally {
            System.out.println("finally");
        }
    }

    private static void tryCatch() {
        String name = null;
        try {
            name.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("oops name cannot be null");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
