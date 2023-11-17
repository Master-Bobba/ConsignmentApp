package com.barclays.service;

import com.barclays.model.Person;
import com.barclays.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class PersonServiceImp implements PersonService{

    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        Iterable<Person> personIterable = personRepository.findAll();
        personIterable.forEach(people::add);
        return people;
    }
}
