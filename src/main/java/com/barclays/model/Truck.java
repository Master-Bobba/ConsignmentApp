package com.barclays.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Truck extends Vehicle{

    public Truck(String brand, double price){
        super(brand, price);
        type = "Truck";
    }

}
