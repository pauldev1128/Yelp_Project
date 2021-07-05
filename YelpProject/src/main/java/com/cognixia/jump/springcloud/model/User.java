package com.cognixia.jump.springcloud.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5091264880832443079L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId; 
	
	@Column(name = "name")
	private String name; 
	
	@Column(unique = true, nullable = false)
	private String username; 
	
	@Column(nullable = false)
	private String password; 

	@OneToMany(mappedBy = "user") 
	Set<Rating> ratings; 
	
	public User() {
		this(-1L, "N/A", "N/A", "N/A", new ArrayList<>());
	}

	public User(Long userId, String name, String username, String password, List<Rating> ratings) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return userId;
	}

	public void setId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(Set<Rating> ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "User [id=" + userId + ", name=" + name + ", username=" + username + ", password=" + password + "]";
	}
}