package com.amigoscode.person;

import java.util.List;
import java.util.Optional;

public interface PersonDAO {
    List<Person> selectAllPeople();
    Optional<Person> selectPersonById(int id);
    int insertPerson(Person person);
    int deletePerson(int id);
    int updatePerson(Person person);
}
