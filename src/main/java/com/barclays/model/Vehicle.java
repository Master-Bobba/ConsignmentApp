package com.barclays.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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

    public Vehicle(String brand, double price){
        this.brand = brand;
        this.price = price;
    }


}
