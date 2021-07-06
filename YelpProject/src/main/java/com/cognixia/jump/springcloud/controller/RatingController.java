package com.cognixia.jump.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.springcloud.model.Rating;
import com.cognixia.jump.springcloud.service.RatingService;
import com.cognixia.jump.springcloud.service.RestaurantService;

@RestController
public class RatingController {
	@Autowired 
	RatingService service; 
	
	@GetMapping("rating/{id}")
	public Rating findRatingById(@PathVariable String id) {
		return service.findRatingById(id);
	}
}
