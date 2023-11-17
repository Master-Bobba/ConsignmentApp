package com.barclays.utility;

import com.barclays.model.Car;
import com.barclays.model.Person;
import com.barclays.model.Truck;
import com.barclays.model.Vehicle;
import com.barclays.repository.PersonRepository;
import com.barclays.repository.VehicleRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class PersonPopulator {

    private PersonRepository personRepository;
    private VehicleRepository vehicleRepository;

    @Autowired
    public PersonPopulator(PersonRepository personRepository, VehicleRepository vehicleRepository){
        this.personRepository = personRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public void populate(){

//        Vehicle toyota = new Car("Toyota", 15000.00);
//        //vehicleRepository.save(toyota);
//
//        Vehicle nissan = new Car("Nissan", 10000.00);
//        //vehicleRepository.save();
//
//        Vehicle audi = new Car("Audi", 25000.00);
//        //vehicleRepository.save();
//        vehicleRepository.save(new Car("Mercedes", 25000.00));
//
//        Vehicle tesla = new Truck("Tesla", 100000.00);
////        vehicleRepository.save(tesla);
//        vehicleRepository.save(new Truck("Range Rover", 150000.00));
//        vehicleRepository.save(new Truck("Tundra", 75000.00));
//
//        Person bobby = new Person("Bobby", "Ayvazov");
//        bobby.addVehicle(toyota);
//        bobby.addVehicle(tesla);
//        personRepository.save(bobby);
//
//        Person alice = new Person("Alice", "Yu");
//        alice.addVehicle(nissan);
//        personRepository.save(alice);
//
//        Person krasi = new Person("Krasimir", "Ayvazov");
//        krasi.addVehicle(audi);
//        personRepository.save(krasi);
//
//        personRepository.save(new Person("My boy", "Alan"));
    }

}
