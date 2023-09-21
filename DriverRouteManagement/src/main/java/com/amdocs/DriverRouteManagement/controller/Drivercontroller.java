package com.amdocs.DriverRouteManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amdocs.DriverRouteManagement.entity.Driver;
import com.amdocs.DriverRouteManagement.service.impl.DriverServiceImpl;

@Controller
public class Drivercontroller {
	@Autowired
	private DriverServiceImpl driverService;
	
	@RequestMapping("/")
	public String loadForm(Model model)
	{
		Driver driver=new Driver();
		model.addAttribute("driver", driver);
		
		return "driver";
	}
	
	@RequestMapping("/insert")
	public String handleEmpForm(@ModelAttribute("driver")Driver driver, Model model)
	{
		
		//interact to service layer
		boolean saveDriver = driverService.saveDriver(driver);
		
		String msg="";
		
		if(saveDriver)
			msg="Data Inserted SuccessFully";
		else
			msg="Data Not Inserted SuccessFully";
		
		model.addAttribute("msg", msg);
		return "driver";
	}
	
	@RequestMapping("/viewAll")
	public String viewAllDriver(Model model)
	{
		//fetch the data from the databse ,can interact service layer
		List<Driver> allDrivers = driverService.getAllDrivers();
		
		model.addAttribute("drivers", allDrivers);
		return "view";
	}
	
	@RequestMapping("/deleteDriver")
	public String deleteDriver(@RequestParam("Did")     int id)
	{
		boolean flag = driverService.deleteDriver(id);
		
		if(flag)
		return "redirect:/viewAll";
		else
		return "redirect:/viewAll";
	}
	
	@RequestMapping("/editDriver")
	public String editDriver(@RequestParam("Did")   int id,Model model)
	{
		Driver driver = driverService.getDriverId(id);
		
		model.addAttribute("driver", driver);
		return "editDriver";
	}
	
	@RequestMapping("/update")
	public String updateDriver(Driver driver)
	{
		boolean updateDriver = driverService.updateDriver(driver);
		
		return "redirect:/viewAll";

	}
	

}
