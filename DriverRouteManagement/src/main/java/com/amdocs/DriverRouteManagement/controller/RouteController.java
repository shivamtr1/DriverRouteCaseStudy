package com.amdocs.DriverRouteManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.DriverRouteManagement.entity.Route;
import com.amdocs.DriverRouteManagement.service.RouteService;

@RestController
@RequestMapping("/routes")
public class RouteController {
	private RouteService routeServ;

	@Autowired
	public RouteController(RouteService routeServ) {
		super();
		this.routeServ = routeServ;
	}
	
	//Basic URI for API Testing
	
	//http://localhost:8085/routes
	//insert into route(book_name, pub_date)values(?,?);
	//insert into route(route_length, start_point, end_point)values(?,?,?)
	//http://localhost:8085/routes/insert
	@PostMapping("/insert")
	public Route saveRoute(@RequestBody Route route)
	{
		return routeServ.saveRoute(route);
	}
	
	//select *from route
	//http://localhost:8085/route/allroutes

	@GetMapping("/allroutes")
	public List<Route> getAllroutes()
	{
		return routeServ.getAllRoutes();
		
	}
	
	//select *from route where route_id=?
	//http://localhost:8085/routes/1
	@GetMapping("/{route_id}")
	public Route getRouteById(@PathVariable int route_id)
	{
		return routeServ.getRouteById(route_id);
	}
	
	//http://localhost:8085/route/update/1
	@PutMapping("/update/{route_id}")
	public Route updateRoute(@PathVariable Integer route_id,@RequestBody Route route)
	{
		return routeServ.updateRoute(route_id, route);
	}
	
	@DeleteMapping("/delete/{route_id}")
	public void deleteRoute(@PathVariable Integer route_id)
	{
		routeServ.deleteRoute(route_id);
	}	
	

}
