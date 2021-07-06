package com.cognixia.jump.springcloud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.jump.springcloud.model.Restaurant;
import com.cognixia.jump.springcloud.repository.RestaurantRepository;

@Service
public class RestaurantService {
	@Autowired
	RestaurantRepository repository;

	public List<Restaurant> findAllRestaurants() {
		return repository.findAll();
	} 
	
	public Restaurant findRestaurantById(String id) {
		Optional<Restaurant> restaurant = repository.findById(Long.parseLong(id)); 
		if (restaurant.isPresent()) {
			return restaurant.get();
		}
		return new Restaurant();
	}


	public List<String> getAllInformation(Restaurant restaurant) {
		List<String> return_value = new ArrayList<>();
		
		String id =  String.valueOf(restaurant.getrestaurantID());
		return_value.add(id); 
		String name = restaurant.getName();
		return_value.add(id);
		String address = restaurant.getAddress();
		return_value.add(address);
		String description = restaurant.getDescription();
		return_value.add(description);
		String style = restaurant.getStyle();
		return_value.add(style);
		String city = restaurant.getCity();
		return_value.add(city);
		String state = restaurant.getState();
		return_value.add(state);
		
		return return_value;
	}
	
	
//	public Restaurant findRestaurantByName(String name) {
//		return repository.findRestaurantByName(name);
//	}
}
