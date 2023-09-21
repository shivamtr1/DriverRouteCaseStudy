package com.amdocs.DriverRouteManagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.DriverRouteManagement.entity.Driver;
import com.amdocs.DriverRouteManagement.repo.DriverRepository;
import com.amdocs.DriverRouteManagement.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {
	@Autowired
	private DriverRepository driverRepo;

	@Override
	public boolean saveDriver(Driver driver) {
		// TODO Auto-generated method stub
		

		// interact db s/w to store data into the database

		Driver driverSave = driverRepo.save(driver);
		boolean flag = false;

		if (driverSave != null)
			flag = true;

		return flag;
		//return false;
	}

	@Override
	public List<Driver> getAllDrivers() {
		// TODO Auto-generated method stub
		//select *from driver;
		List<Driver> driverRecords = driverRepo.findAll();
		return driverRecords;
		//return null;
	}

	@Override
	public Driver getDriverId(int id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//select *From driver where did=?;
		Optional<Driver> driverId = driverRepo.findById(id);
		Driver driver = driverId.get();
		return driver;
		
		//return null;
	}

	@Override
	public boolean updateDriver(Driver st) {
		// TODO Auto-generated method stub
		//Record is exist or not have to check once record is exist then update the data
		
		return saveDriver(st);
		//return false;
	}

	@Override
	public boolean deleteDriver(int id) {
		// TODO Auto-generated method stub
		//Record is exist or not have to check first then delete
		Driver driver = getDriverId(id);
		boolean flag=false;
		if(driver!=null)
		{
			driverRepo.delete(driver);
		flag=true;	
		}
		return flag;		
		//return false;
	}


}
