package com.api.parking.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.parking.models.ParkingModel;

public interface ParkingRepository extends JpaRepository<ParkingModel, UUID> {

}
