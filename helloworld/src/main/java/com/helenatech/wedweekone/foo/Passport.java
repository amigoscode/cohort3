package com.helenatech.wedweekone.foo;

import com.helenatech.wedweekone.Person;

public class Passport {

    private int number;
    private String color;
    private Nationality nationlity;
    private Person person;

    public Passport(int number, String color, Nationality nationlity, Person person) {
        this.number = number;
        this.color = color;
        this.nationlity = nationlity;
        this.person = person;
    }

    public Passport() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Nationality getNationlity() {
        return nationlity;
    }

    public void setNationlity(Nationality nationlity) {
        this.nationlity = nationlity;
    }
}
