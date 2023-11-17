package com.barclays.service;

import com.barclays.model.Vehicle;
import com.barclays.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleServiceImp implements VehicleService{

    private VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImp(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> findAll() {
        Iterable<Vehicle> vehicleIterable = vehicleRepository.findAll();
        List<Vehicle> vehicles = new ArrayList<>();
        vehicleIterable.forEach(vehicles::add);
        return vehicles;
    }

    @Override
    public List<Vehicle> findByTypeContains(String Type) {
        Iterable<Vehicle> vehicleIterable = vehicleRepository.findByTypeContains(Type);
        List<Vehicle> vehicles = new ArrayList<>();
        vehicleIterable.forEach(vehicles::add);
        return vehicles;
    }
}
