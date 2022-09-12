package com.mjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjava.entity.CitizenEntity;
import com.mjava.service.CitizenService;
import com.mjava.service.CitizenServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class CitizenController {
	@Autowired
	public CitizenServiceImpl citizenService;
	
	@PostMapping("/insertcitizen")
	public  CitizenEntity  insertCitizen(@RequestBody CitizenEntity citizen)
	{
		//testing git 
	 return citizenService.insertCitizenService(citizen);
		 
	}

}
