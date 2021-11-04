package com.amigoscode.person;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("postgres")
public class PersonDataAccessService implements PersonDAO {

    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(1, "REAL DB", 0, List.of()));
    }

    @Override
    public Optional<Person> selectPersonById(int id) {

        return Optional.empty();
    }

    @Override
    public int insertPerson(Person person) {
        return 0;
    }

    @Override
    public int deletePerson(int id) {
        return 0;
    }

    @Override
    public int updatePerson(Person person) {
        return 0;
    }
}
