package com.cps.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ZipCodeWindZone {

	@Id
	private String zipcode;
	private String windZone;
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getWindZone() {
		return windZone;
	}
	public void setWindZone(String windZone) {
		this.windZone = windZone;
	}
	
	public ZipCodeWindZone(String zipcode, String windZone) {
		super();
		this.zipcode = zipcode;
		this.windZone = windZone;
	}
	
	public ZipCodeWindZone() {
		super();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ZipCodeWindZone [zipcode=");
		builder.append(zipcode);
		builder.append(", windZone=");
		builder.append(windZone);
		builder.append("]");
		return builder.toString();
	}
		
}
