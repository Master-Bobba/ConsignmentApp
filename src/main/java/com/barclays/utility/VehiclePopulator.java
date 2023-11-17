package com.barclays.utility;

import com.barclays.model.Car;
import com.barclays.model.Truck;
import com.barclays.repository.VehicleRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class VehiclePopulator {

    private VehicleRepository vehicleRepository;

    @Autowired
    public VehiclePopulator(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    public void populate(){

        vehicleRepository.save(new Car("Toyota", 15000.00));
        vehicleRepository.save(new Car("Nissan", 10000.00));
        vehicleRepository.save(new Car("Audi", 25000.00));
        vehicleRepository.save(new Car("Mercedes", 25000.00));

        vehicleRepository.save(new Truck("Tesla", 100000.00));
        vehicleRepository.save(new Truck("Range Rover", 150000.00));
        vehicleRepository.save(new Truck("Tundra", 75000.00));
    }
}
