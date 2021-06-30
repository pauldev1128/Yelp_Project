package com.cognixia.jump.springcloud.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Rating implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6527537147124108138L;
	
	@Column(name = "userID")
	private Long user_id; 
	
	@Column(name = "resturantID")
	private Long resturantID; 
	
	@Column(name = "rating")
	private Integer rating; 
	
	@Column(name = "review")
	private String review;

	public Rating(){
		this(-1L, 1L, 0, "N/A"); 
	}
	public Rating(Long user_id, Long resturantID, Integer rating, String review) {
		super();
		this.user_id = user_id;
		this.resturantID = resturantID;
		this.rating = rating;
		this.review = review;
	}


	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public Long getResturantID() {
		return resturantID;
	}


	public void setResturantID(Long resturantID) {
		this.resturantID = resturantID;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public String getReview() {
		return review;
	}


	public void setReview(String review) {
		this.review = review;
	}


	@Override
	public String toString() {
		return "Rating [user_id=" + user_id + ", resturantID=" + resturantID + ", rating=" + rating + ", review="
				+ review + "]";
	} 
}