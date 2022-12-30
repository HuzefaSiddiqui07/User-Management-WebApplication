package com.xadmin.usermanagement.model;

/**
 * User.java This is a model class represents a User entity
 * 
 * @author Huzefa Siddiqui
 *
 */

public class User {

	// Declare
	private int id;
	private String name;
	private String email;
	private String country;

	// Use Parameterized Constructor -1 without I'd
	public User(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
	}

	// Use Parameterized Constructor -2 with I'd
	public User(int id, String name, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
	}

	// Use Getter & Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
