package com.helenatech;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args[0].equals("json")) {
            System.out.println("{'message': \'hello\'}");

        } else {
            System.out.println("hello");
        }
        System.out.println(Arrays.toString(args));
    }
}
