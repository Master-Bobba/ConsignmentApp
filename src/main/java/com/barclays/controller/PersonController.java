package com.barclays.controller;

import com.barclays.model.Person;
import com.barclays.model.Vehicle;
import com.barclays.service.PersonService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/people")
    public List<Person> getAllPeople(){
        List<Person> people;
        people = personService.findAll();
        people.sort(Comparator.comparing(Person::getFirstName));
        return people;
    }

    @GetMapping("/vehicles/{name}")
    public List<Vehicle> getPersonsVehicles(@PathVariable String name){
        List<Person> people;
        List<Vehicle> vehicles = Collections.emptyList();
        people = personService.findAll();
        for (Person person : people){
            if (person.getFirstName().equals(name)){
                vehicles = person.getVehicles();
            }
        }
        return vehicles;
    }
}
