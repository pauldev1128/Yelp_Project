package com.cognixia.jump.springcloud.service;

import org.springframework.stereotype.Service;

import com.cognixia.jump.springcloud.model.Rating;
import com.cognixia.jump.springcloud.repository.RatingRepository;
import com.cognixia.jump.springcloud.repository.UserRepository;

@Service
public class UserService {
	
	RatingRepository repository; 
	
	//Post
	public String addPost(Rating rating) {
		Rating the_rating = repository.save(rating);
		return "Your post of " + the_rating.getRating() + " stars was saved";
	}

}
