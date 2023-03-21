package com.api.parkingcontrol.services;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotRepository;

@Service
public class ParkingSpotService {
    
    final ParkingSpotRepository parkingSpotRepository;

    ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
