package com.amigoscode.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("fake") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public List<Person> getPeople() {
        return personDAO.selectAllPeople();
    }

    public void registerPerson(Person person) {
        // business logic if any
        personDAO.insertPerson(person);
    }

    public void deletePerson(int id) {
        // business logic
        personDAO.deletePerson(id);
    }
}
