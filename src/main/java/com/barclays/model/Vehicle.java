package com.barclays.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

    @Id
    @GeneratedValue
    private Integer id;

    private String brand;
    private double price;

    protected String type;

    @ManyToOne
    @JsonBackReference
    protected Person owner;

    public Vehicle(String brand, double price){
        this.brand = brand;
        this.price = price;
    }


}
