package com.amigoscode.person;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("postgres")
public class PersonDataAccessService implements PersonDAO {

    private JdbcTemplate jdbcTemplate;

    public PersonDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Person> selectAllPeople() {
        String sql = """
                    SELECT id, name, age
                    FROM person
                """;
        List<Person> people = jdbcTemplate.query(sql, new PersonRowMapper());
        return people;

    }

    @Override
    public Optional<Person> selectPersonById(int id) {
        String sql = """
                    SELECT id, name, age
                    FROM person
                    WHERE id = ?
                """;
            return jdbcTemplate.query(sql, new PersonRowMapper(), id)
                    .stream()
                    .findFirst();
    }

    @Override
    public int insertPerson(Person person) {
        String sql = """
                INSERT INTO person(name, age) 
                VALUES(?, ?);
                """;
        return jdbcTemplate.update(sql, person.getName(), person.getAge());
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
