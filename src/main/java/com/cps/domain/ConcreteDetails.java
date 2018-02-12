package com.cps.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConcreteDetails {

	@Id
	private String sno;
	private String mfr;
	private String roofTile;
	private String length;
	private String width;
	private String noOfTile;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getMfr() {
		return mfr;
	}
	public void setMfr(String mfr) {
		this.mfr = mfr;
	}
	public String getRoofTile() {
		return roofTile;
	}
	public void setRoofTile(String roofTile) {
		this.roofTile = roofTile;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getNoOfTile() {
		return noOfTile;
	}
	public void setNoOfTile(String noOfTile) {
		this.noOfTile = noOfTile;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConcreteDetails [sno=");
		builder.append(sno);
		builder.append(", mfr=");
		builder.append(mfr);
		builder.append(", roofTile=");
		builder.append(roofTile);
		builder.append(", length=");
		builder.append(length);
		builder.append(", width=");
		builder.append(width);
		builder.append(", noOfTile=");
		builder.append(noOfTile);
		builder.append("]");
		return builder.toString();
	}
	public ConcreteDetails(String sno, String mfr, String roofTile, String length, String width, String noOfTile) {
		super();
		this.sno = sno;
		this.mfr = mfr;
		this.roofTile = roofTile;
		this.length = length;
		this.width = width;
		this.noOfTile = noOfTile;
	}
	public ConcreteDetails() {
		super();
	}	
}
