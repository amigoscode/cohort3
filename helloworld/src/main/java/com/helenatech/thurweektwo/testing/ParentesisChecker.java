package com.helenatech.thurweektwo.testing;

import java.util.Stack;

public class ParentesisChecker {

    public boolean check(String inputStr2) {
        Stack<Character> stack = new Stack<>();
        char[] arrayOfStChars = inputStr2.toCharArray();

        if (inputStr2.isEmpty()) return false;

        for (char c : arrayOfStChars) {
            switch (c) {
                case '(', '{' -> stack.push(c);
                case ')' -> {
                    if (stack.empty()) {
                        return false;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                    } else return false;
                }
                case '}' -> {
                    if (stack.empty()) {
                        return false;
                    } else if (stack.peek() == '{') {
                        stack.pop();
                    } else return false;
                }
            }
        }
        return stack.empty();

    }
}