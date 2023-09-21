package com.amdocs.DriverRouteManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.DriverRouteManagement.entity.Route;
import com.amdocs.DriverRouteManagement.repo.RouteRepository;

@Service
public class RouteService {
	private RouteRepository routeRepo;

	@Autowired
	public RouteService(RouteRepository routeRepo) {
		super();
		this.routeRepo = routeRepo;
	}
	
	public Route saveRoute(Route route)
	{
		return routeRepo.save(route); 
	}
	
	public List<Route> getAllRoutes()
	{
		return routeRepo.findAll();
	}
	
	public 	Route getRouteById(int routeID)
	{
		return routeRepo.findById(routeID).orElse(null);
	}
	
	public Route updateRoute(Integer routeId, Route route)
	{
		Route existingRoute=routeRepo.findById(routeId).orElse(null);
		
		if(existingRoute!=null)
		{
			existingRoute.setRouteLength(route.getRouteLength());
			existingRoute.setStartPoint(route.getStartPoint());
			existingRoute.setEndPoint(route.getEndPoint());

		return routeRepo.save(existingRoute);
		}
		return null;
	}
	
	public void deleteRoute(Integer routeId)
	{
		 routeRepo.deleteById(routeId);
	}

}
