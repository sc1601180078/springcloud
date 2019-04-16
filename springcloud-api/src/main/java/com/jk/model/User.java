package com.jk.model;

import java.io.Serializable;

public class User implements Serializable {


	private static final long serialVersionUID = 2990078733200374105L;
	private Integer userId;

	private String userName;
	
	private Integer userAge;
	
	private String userPassword;


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userAge=" + userAge +
				", userPassword='" + userPassword + '\'' +
				'}';
	}
}
