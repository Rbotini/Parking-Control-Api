package com.api.parking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.parking.service.ParkingService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600 )
@RequestMapping("/parking")
public class ParkingController {
	
	final ParkingService parkingService;

	public ParkingController(ParkingService parkingService) {
		super();
		this.parkingService = parkingService;
	}
	
	
	
	

}
