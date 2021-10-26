package com.helenatech.friweekone;

import java.util.ArrayList;
import java.util.List;

public class PersonDB {

    private List<Person> db;

    public PersonDB() {
        this.db = new ArrayList<>();
    }

    public void addNewPerson(Person person) {
        boolean exists = db.contains(person);
        if(!exists) {
            db.add(person);
        }
    }

    public void deletePerson(Person person) {
        boolean exists = db.contains(person);
        if(exists) {
            db.remove(person);
        }
    }
}
