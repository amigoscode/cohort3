package com.amigoscode.person;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fake")
public class FakePersonDataAccessService implements PersonDAO {

    private List<Person> db = new ArrayList<>();

    public FakePersonDataAccessService() {
        db.add(new Person(1, "Helena", 20, List.of("Sausages")));
        db.add(new Person(2, "Oliver", 24, List.of("Salmon")));
    }

    public List<Person> selectAllPeople() {
        return db;
    }

    @Override
    public Optional<Person> selectPersonById(int id) {
        return Optional.empty();
    }

    public int insertPerson(Person person) {
        db.add(person);
        return 1;
    }

    public int deletePerson(int id) {
        Optional<Person> person = selectAllPeople()
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst();

        person.ifPresent(p -> db.remove(p));
        return 1;
    }

    @Override
    public int updatePerson(Person person) {
        return 0;
    }
}
