package com.cognixia.jump.springcloud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.springcloud.model.Rating;
import com.cognixia.jump.springcloud.repository.RatingRepository;

@Repository
public class RatingService {
	@Autowired 
	public RatingRepository repository; 
		
	public Rating findRatingById(String id) {
		Optional<Rating> rating = repository.findById(Long.parseLong(id));
		if (rating.isPresent()) {
			return rating.get();
		}
		return new Rating();
	}
}
