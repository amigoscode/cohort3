package com.helenatech.friweektwo.exercise;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;


class PersonServiceTest {

    private PersonDAO personDAO;
    private PersonService underTest;

    @BeforeEach
    void setUp() {

        // TODO: create a mock for personDAO
        // TODO: create an instance of underTest and pass personDAO into it

    }

    /*
       TODO: Test all these methods.
        You might need to create additional methods. Check test coverage
    */

//    Good luck :)

    @Test
    void itCanSavePerson() {
    }

    @Test
    void itCanDeletePerson() {
    }

    @Test
    void canGetPeopleFromDB() {
    }

    @Test
    void canGetPersonById() {
        Map<String, Integer> expected = Map.of(
                "a", 2,
                "b", 1
        );
    }
}