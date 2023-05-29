package com.security.dto;


public class UserDetails {
	
	int id;
	String username;
	String role;
	String password;
	
	public UserDetails() {}

	public UserDetails(int id, String username, String role, String password) {
		super();
		this.id = id;
		this.username = username;
		this.role = role;
		this.password = password;
	}

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", username=" + username + ", role=" + role + ", password=" + password + "]";
	}
	
}
