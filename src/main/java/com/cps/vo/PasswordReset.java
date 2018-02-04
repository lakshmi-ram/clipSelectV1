package com.cps.vo;

public class PasswordReset {

	String userName;
	String email;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PasswordReset [userName=");
		builder.append(userName);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}	
}
