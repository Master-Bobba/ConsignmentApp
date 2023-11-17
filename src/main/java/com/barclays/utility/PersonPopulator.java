package com.barclays.utility;

import com.barclays.model.Person;
import com.barclays.repository.PersonRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class PersonPopulator {

    private PersonRepository personRepository;

    @Autowired
    public PersonPopulator(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void populate(){
        personRepository.save(new Person("Bobby", "Ayvazov"));
        personRepository.save(new Person("Alice", "Yu"));
        personRepository.save(new Person("Krasimir", "Ayvazov"));
        personRepository.save(new Person("My boy", "Alan"));
    }

}
