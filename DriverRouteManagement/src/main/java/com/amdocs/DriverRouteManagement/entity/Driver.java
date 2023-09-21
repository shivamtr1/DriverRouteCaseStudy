package com.amdocs.DriverRouteManagement.entity;

import javax.persistence.Column;
import javax.persistence.*;

//import jakarta.persistence.*;



@Entity
@Table(name = "DRIVER")
public class Driver {
	@Id
	@Column(name = "DId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driverId;
	
	@Column(name = "DRIVER_NAME")
	private String driverName;
	
	@Column(name = "DRIVER_AGE")
	private int driverAge;
	
	@Column(name = "DRIVER_CONTACT")
	private Long driverContact;
	
	@Column(name = "DRIVER_LICENSE")
	private int driverLicense;
	
	
	public Driver() {
		super();
	}

	public Driver(int driverId, String driverName, int driverAge, Long driverContact, int driverLicense) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverAge = driverAge;
		this.driverContact = driverContact;
		this.driverLicense = driverLicense;
	}
	
	public int getDriverId() {
		return driverId;
	}
	
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public int getDriverAge() {
		return driverAge;
	}
	
	public void setDriverAge(int driverAge) {
		this.driverAge = driverAge;
	}

	public Long getDriverContact() {
		return driverContact;
	}

	public void setDriverContact(Long driverContact) {
		this.driverContact = driverContact;
	}

	public int getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(int driverLicense) {
		this.driverLicense = driverLicense;
	}

	
}
