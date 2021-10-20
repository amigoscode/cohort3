package com.helenatech.wedweekone.foo;

public class Exercise2 {

    static String[] foo = {};

    private static void sstatic(String[] args) {
        String s = foo[0];
        String[] mythicalCreatures = {
                "Unicorn", "Troll", "Dragon",
                "Centaur", "Amazonian Salamander", "Sphinx"};
        String longest = longestStrings(mythicalCreatures);
        System.out.println(longest);
    }

    public static void nonStatic(String[] args) {
        sstatic(null);
        String[] mythicalCreatures = {
                "Unicorn", "Troll", "Dragon",
                "Centaur", "Amazonian Salamander", "Sphinx"};
        String longest = longestStrings(mythicalCreatures);
        System.out.println(longest);
    }


    static String longestStrings(String[] input) {
        int index = 0;
        int element = input[0].length();
        for (int i = 1; i < input.length; i++) {
            if (input[i].length() > element) {
                index = i;
                element = input[i].length();
            }
        }
        return input[index];
    }
}


