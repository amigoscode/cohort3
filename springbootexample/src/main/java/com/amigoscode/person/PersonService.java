package com.amigoscode.person;

import com.amigoscode.exception.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Person> personOptional = personDAO.selectPersonById(id);
        if (personOptional.isEmpty()) {
            throw new ResourceNotFound("person with id id: " + id + " not found");
        }
        personDAO.deletePerson(id);
    }
}
