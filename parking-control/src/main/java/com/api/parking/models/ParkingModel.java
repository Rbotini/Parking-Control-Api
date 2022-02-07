package com.api.parking.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PARKING_CONTROL")

public class ParkingModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private UUID id;
	
	@Column(nullable =false,unique = true,length = 10)
	private String parkingNumber;
	
	@Column(nullable = false,unique = true, length = 7)
	private String licenseCar;
	
	@Column(nullable = false,length =20 )
	private String brandCar;
	
	@Column(nullable = false,length = 20)
	private String modelCar;
	
	@Column(nullable = false,length = 20)
	private String colorCar;
	@Column(nullable = false)
	private LocalDateTime regitrationCar;
	@Column(nullable = false,length = 30)
	private String responsabiliName;
	@Column(nullable = false,length = 20)
	private String apartament;
	@Column(nullable = false,length = 20)
	private String block;
	
	public ParkingModel() {
		
	}

	public ParkingModel(UUID id, String parkingNumber, String licenseCar, String brandCar, String modelCar,
			String colorCar, LocalDateTime regitrationCar, String responsabiliName, String apartament, String block) {
		super();
		this.id = id;
		this.parkingNumber = parkingNumber;
		this.licenseCar = licenseCar;
		this.brandCar = brandCar;
		this.modelCar = modelCar;
		this.colorCar = colorCar;
		this.regitrationCar = regitrationCar;
		this.responsabiliName = responsabiliName;
		this.apartament = apartament;
		this.block = block;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getParkingNumber() {
		return parkingNumber;
	}

	public void setParkingNumber(String parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

	public String getLicenseCar() {
		return licenseCar;
	}

	public void setLicenseCar(String licenseCar) {
		this.licenseCar = licenseCar;
	}

	public String getBrandCar() {
		return brandCar;
	}

	public void setBrandCar(String brandCar) {
		this.brandCar = brandCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public String getColorCar() {
		return colorCar;
	}

	public void setColorCar(String colorCar) {
		this.colorCar = colorCar;
	}

	public LocalDateTime getRegitrationCar() {
		return regitrationCar;
	}

	public void setRegitrationCar(LocalDateTime regitrationCar) {
		this.regitrationCar = regitrationCar;
	}

	public String getResponsabiliName() {
		return responsabiliName;
	}

	public void setResponsabiliName(String responsabiliName) {
		this.responsabiliName = responsabiliName;
	}

	public String getApartament() {
		return apartament;
	}

	public void setApartament(String apartament) {
		this.apartament = apartament;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}
	

}
