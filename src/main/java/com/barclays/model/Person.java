package com.barclays.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
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
    private String firstname;
    private String secondname;

    @JsonManagedReference
    @OneToMany(mappedBy = "owner")
    private List<Vehicle> vehicles;

    public Person(String firstname, String secondname){
        this.firstname = firstname;
        this.secondname = secondname;
        vehicles = new ArrayList<>();
    }

//    public void addVehicle(Vehicle vehicle){
//        this.vehicles.add(vehicle);
//    }

}
