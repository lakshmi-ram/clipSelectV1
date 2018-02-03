package com.cps.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
	String userName; //Benutzername
	String password; //Kennwort
	String active;
	String activationCode;
	
	String surName; //nachname
	String firstName; //Vorname
	String occupation; //Tätigkeitsfeld
	String company; //Firma
	String road; //Straße
	String postCode; //PLZ
	String place; //Ort
	String country; //Land
	String phone; //Telefon
	String fax; //Fax
	String language; //Sprache
	String email; //E-Mail
	String emailConf; //E-Mail Bestätigung
	String passwordConf; //pwd Conf	
	
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
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailConf() {
		return emailConf;
	}
	public void setEmailConf(String emailConf) {
		this.emailConf = emailConf;
	}
	public String getPasswordConf() {
		return passwordConf;
	}
	public void setPasswordConf(String passwordConf) {
		this.passwordConf = passwordConf;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", active=");
		builder.append(active);
		builder.append(", activationCode=");
		builder.append(activationCode);
		builder.append(", surName=");
		builder.append(surName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", occupation=");
		builder.append(occupation);
		builder.append(", company=");
		builder.append(company);
		builder.append(", road=");
		builder.append(road);
		builder.append(", postCode=");
		builder.append(postCode);
		builder.append(", place=");
		builder.append(place);
		builder.append(", country=");
		builder.append(country);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", fax=");
		builder.append(fax);
		builder.append(", language=");
		builder.append(language);
		builder.append(", email=");
		builder.append(email);
		builder.append(", emailConf=");
		builder.append(emailConf);
		builder.append(", passwordConf=");
		builder.append(passwordConf);
		builder.append("]");
		return builder.toString();
	}
	public User(String userName, String password, String active, String activationCode, String surName,
			String firstName, String occupation, String company, String road, String postCode, String place,
			String country, String phone, String fax, String language, String email, String emailConf,
			String passwordConf) {
		super();
		this.userName = userName;
		this.password = password;
		this.active = active;
		this.activationCode = activationCode;
		this.surName = surName;
		this.firstName = firstName;
		this.occupation = occupation;
		this.company = company;
		this.road = road;
		this.postCode = postCode;
		this.place = place;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
		this.language = language;
		this.email = email;
		this.emailConf = emailConf;
		this.passwordConf = passwordConf;
	}
	public User() {
		super();
	}	
}
