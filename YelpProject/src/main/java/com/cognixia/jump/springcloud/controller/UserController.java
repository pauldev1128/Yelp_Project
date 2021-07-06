package com.cognixia.jump.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.springcloud.model.Rating;
import com.cognixia.jump.springcloud.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service; 
	
	@PostMapping("/rating")
	public String addPost(Rating rating) {
		return service.addPost(rating);
	}
	
	
}
