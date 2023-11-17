package com.barclays.controller;


import com.barclays.model.Person;
import com.barclays.model.Vehicle;
import com.barclays.service.PersonService;
import com.barclays.service.VehicleService;
import jakarta.websocket.server.PathParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;

@RestController
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService){
        this.vehicleService = vehicleService;

    }

    @GetMapping("/vehicles")
    public List<Vehicle> getAllVehicles(){
        List<Vehicle> vehicles;
        vehicles =  vehicleService.findAll();
        return vehicles;
    }

    @GetMapping("/cars")
    public List<Vehicle> getAllCars(){
        List<Vehicle> vehicles;
        vehicles =  vehicleService.findByTypeContains("Car");
        vehicles.sort(Comparator.comparing(Vehicle::getPrice));
        return vehicles;
    }

    @GetMapping("/trucks")
    public List<Vehicle> getAllTrucks(){
        List<Vehicle> vehicles;
        vehicles =  vehicleService.findByTypeContains("Truck");
        vehicles.sort(Comparator.comparing(Vehicle::getPrice));
        return vehicles;
    }


}
