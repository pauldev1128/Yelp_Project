package com.cognixia.jump.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.springcloud.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
}
