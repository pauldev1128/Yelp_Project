package com.cognixia.jump.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.springcloud.model.Restaurant;
import com.cognixia.jump.springcloud.service.RestaurantService;

@RestController
public class RestaurantController{
	
	@Autowired 
	RestaurantService service; 
	
	//Find All
	@GetMapping("/restaurant")
	public List<Restaurant> findAllRestaurants() {
		return service.findAllRestaurants();
	}
	
	@GetMapping("/restaurant/{id}")
	public Restaurant findRestaurantById(@PathVariable String id) {
		return service.findRestaurantById(id);
	}
	
	@GetMapping("/restaurant/{id}/all")
	public List<String> getAllInformation(@PathVariable Restaurant restaurant){
		return service.getAllInformation(restaurant);
	}
//	@GetMapping("restaurant/name")
//	public Restaurant findRestaurantByName(@PathVariable String name){
//		return service.findRestaurantByName(name);
//		
//	}

}
