package com.amdocs.DriverRouteManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.DriverRouteManagement.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer>  {
	//findByxxx
	//Customized queries
}
