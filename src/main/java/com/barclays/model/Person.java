package com.barclays.model;


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
    private String firstName;
    private String secondName;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Vehicle> vehicles;

    public Person(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

}
