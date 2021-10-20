package com.helenatech.wedweekone.foo;

public class Calculator {

    public int addTwoNumber(int n1, int n2) {
//        int result = n1 + n2;
        return n1 + n2;
    }

    public boolean isEven(int number) {
//        int result = n1 + n2;
        return number % 2 == 0;

    }

    public void isEvenPrint(int number) {
//        int result = n1 + n2;
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public Phone getPhone() {
        return new Phone();
    }

}
