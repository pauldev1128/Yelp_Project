package com.cognixia.jump.springcloud.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5701562031229219364L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long adminId; 
	
	@Column(name = "name")
	private String name; 
	
	@Column(unique = true, nullable = false)
	private String username; 
	
	@Column(nullable = false)
	private String password;

	public Admin() {
		this(-1L, "N/A", "N/A", "N/A");
	}

	public Admin(Long adminId, String name, String username, String password) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return adminId;
	}

	public void setId(Long adminId) {
		this.adminId = adminId;
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
	
	@Override
	public String toString() {
		return "Admin [id=" + adminId + ", name=" + name + ", username=" + username + ", password=" + password + "]";
	} 
}