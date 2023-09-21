package com.amdocs.DriverRouteManagement.service;

import java.util.List;

import com.amdocs.DriverRouteManagement.entity.Driver;

public interface DriverService {
	public boolean saveDriver(Driver driver);
	
	public List<Driver> getAllDrivers();
	
	public Driver getDriverId(int id);

	public boolean updateDriver(Driver st);

	public boolean deleteDriver(int id);
	

}
