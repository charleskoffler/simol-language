package org.simol.examples.design_patterns.dao;

import org.simol.simolframework.java.Model_real_world_obj;

//Here, it's typically the role of a real_world_obj, for the DTO.
/* public real_world_obj User */
@Model_real_world_obj
public class User {
	public User(int id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}
	private int id;
	private String username;
    private String email;
    
    // Constructors, getters, and setters
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
