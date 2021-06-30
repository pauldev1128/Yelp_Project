package com.cognixia.jump.springcloud.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7467891217889755204L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long restaurantID; 
	
	@Column(name = "name")
	private String name; 
	
	@Column(name = "address")
	private String address; 
	
	@Column(name = "description")
	private String description; 
	
	@Column(name = "style")
	private String style; 
	
	@Column(name = "city")
	private String city; 
	
	@Column(name = "state")
	private String state;

	
	public Restaurant() {
		this(-1L, "N/A", "N/A", "N/A", "N/A", "N/A", "N/A");
	}


	public Restaurant(Long restaurantID, String name, String address, String description, String style, String city,
			String state) {
		super();
		this.restaurantID = restaurantID;
		this.name = name;
		this.address = address;
		this.description = description;
		this.style = style;
		this.city = city;
		this.state = state;
	}


	public Long getrestaurantID() {
		return restaurantID;
	}


	public void setrestaurantID(Long restaurantID) {
		this.restaurantID = restaurantID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStyle() {
		return style;
	}


	public void setStyle(String style) {
		this.style = style;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Restaurant [restaurantID=" + restaurantID + ", name=" + name + ", address=" + address
				+ ", description=" + description + ", style=" + style + ", city=" + city + ", state=" + state + "]";
	} 	
}