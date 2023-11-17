package com.barclays.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String secondName;

    public Person(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

//    @OneToMany
//    private List<Vehicle> vehicles = new ArrayList<Vehicle>()

}
