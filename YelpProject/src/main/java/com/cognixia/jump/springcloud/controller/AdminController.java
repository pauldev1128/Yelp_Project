package com.cognixia.jump.springcloud.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.springcloud.repository.AdminRepository;

@CrossOrigin
@RequestMapping("/api")
@RestController
public class AdminController {

	@Autowired
	AdminRepository service;
	
	@CrossOrigin
	@PatchMapping("/update/Resturant")
	public @ResponseBody String updateResturant(@RequestBody Resturant rest) {
		Optional<Resturant> found = service.findAllById(rest.getID());
		
		if(found.isPresent()) {
			service.save(rest);
			return "Saved: " + rest.toString();
		}
		else {
			return "Could not update resturant, the id = " + rest.getId() + " doesn't exist";
		}
	}
}
