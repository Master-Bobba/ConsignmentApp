package com.barclays.repository;

import com.barclays.model.Car;
import com.barclays.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

    List<Vehicle> findByTypeContains(String Type);

}
