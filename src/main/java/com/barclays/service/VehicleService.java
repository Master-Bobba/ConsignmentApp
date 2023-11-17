package com.barclays.service;

import com.barclays.model.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAll();
    List<Vehicle> findByTypeContains(String Type);
}
