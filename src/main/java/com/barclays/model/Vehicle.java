package com.barclays.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public abstract class Vehicle {

    @Id
    @GeneratedValue
    private Integer id;

    private String brand;
    private double price;

    protected String type;

    public Vehicle(String brand, double price){
        this.brand = brand;
        this.price = price;
    }


}
