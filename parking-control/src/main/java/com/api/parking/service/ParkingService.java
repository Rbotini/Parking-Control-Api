package com.api.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parking.repository.ParkingRepository;

@Service


public class ParkingService {

	
	final ParkingRepository parkigrepository;

	public ParkingService(ParkingRepository parkigrepository) {
		super();
		this.parkigrepository = parkigrepository;
	}
	
	
	
	
	
	
}
