package com.mercurymedical.model;

import java.io.Serializable;

public class User implements Serializable{
	
	private String username;
	private String password;
	private int role;
	private String dateOfLastLogin;
	
	
	public User() {
		super();
	}

	/**
	 * @param username
	 * @param password
	 * @param role
	 * @param dateOfLastLogin
	 */
	public User(String username, String password, int role, String dateOfLastLogin) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.dateOfLastLogin = dateOfLastLogin;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public int getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(int role) {
		this.role = role;
	}

	/**
	 * @return the dateOfLastLogin
	 */
	public String getDateOfLastLogin() {
		return dateOfLastLogin;
	}

	/**
	 * @param dateOfLastLogin the dateOfLastLogin to set
	 */
	public void setDateOfLastLogin(String dateOfLastLogin) {
		this.dateOfLastLogin = dateOfLastLogin;
	}
	
		

}
