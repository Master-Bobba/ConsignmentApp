package com.barclays.repository;

import org.springframework.stereotype.Repository;
import com.barclays.model.Person;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
