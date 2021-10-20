package com.helenatech.wedweekone.foo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.doSomethingPublic();
        bar.doSomethingPackageProtected();

        Scanner scanner = new Scanner(System.in);
    }
}
