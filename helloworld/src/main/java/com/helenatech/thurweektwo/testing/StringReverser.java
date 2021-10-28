package com.helenatech.thurweektwo.testing;

public class StringReverser {

    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        StringBuilder result = new StringBuilder();

        for(int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }

        return result.toString();

    }

}
