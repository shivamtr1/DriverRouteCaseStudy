package com.amdocs.DriverRouteManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.DriverRouteManagement.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {
	

}
