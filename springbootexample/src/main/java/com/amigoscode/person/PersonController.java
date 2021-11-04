package com.amigoscode.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getPeople() {
        return personService.getPeople();
    }

    @GetMapping("{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return personService.getPerson(id);
    }

    @PostMapping
    public void registerPerson(@RequestBody Person person) {
        personService.registerPerson(person);
    }

    @PutMapping("{id}")
    public void updatePerson(@PathVariable("id") int id,
                             @RequestBody Person person) {
        // todo: implement me

    }

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable("id") int id) {
        personService.deletePerson(id);
    }

}
