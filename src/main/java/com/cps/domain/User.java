package com.cps.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
	String userName;
	String password;
	String active;
	String activationCode;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getActivationCode() {
		return activationCode;
	}
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", active=");
		builder.append(active);
		builder.append(", activationCode=");
		builder.append(activationCode);
		builder.append("]");
		return builder.toString();
	}
	public User() {
		super();
	}
	public User(String userName, String password, String active, String activationCode) {
		super();	
		this.userName = userName;
		this.password = password;
		this.active = active;
		this.activationCode = activationCode;
	}
	
}
