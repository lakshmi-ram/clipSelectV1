package com.cps.vo;

public class ProcessVO {

	String country;
	String zipcode;
	String windZone;
	String landType;
	String height;
	String roofTileMfr;
	String roofTile;
	String length;
	String width;
	String noOfTile;
	String batten;
	String roofType;
	String buildingHeight;
	String pitch;
	String sizeA;
	String sizeB;
	String substrate;
	String agree;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
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
	public String getLandType() {
		return landType;
	}
	public void setLandType(String landType) {
		this.landType = landType;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getRoofTileMfr() {
		return roofTileMfr;
	}
	public void setRoofTileMfr(String roofTileMfr) {
		this.roofTileMfr = roofTileMfr;
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
	public String getBatten() {
		return batten;
	}
	public void setBatten(String batten) {
		this.batten = batten;
	}
	public String getRoofType() {
		return roofType;
	}
	public void setRoofType(String roofType) {
		this.roofType = roofType;
	}
	public String getBuildingHeight() {
		return buildingHeight;
	}
	public void setBuildingHeight(String buildingHeight) {
		this.buildingHeight = buildingHeight;
	}
	public String getPitch() {
		return pitch;
	}
	public void setPitch(String pitch) {
		this.pitch = pitch;
	}
	public String getSizeA() {
		return sizeA;
	}
	public void setSizeA(String sizeA) {
		this.sizeA = sizeA;
	}
	public String getSizeB() {
		return sizeB;
	}
	public void setSizeB(String sizeB) {
		this.sizeB = sizeB;
	}
	public String getSubstrate() {
		return substrate;
	}
	public void setSubstrate(String substrate) {
		this.substrate = substrate;
	}
	public String getAgree() {
		return agree;
	}
	public void setAgree(String agree) {
		this.agree = agree;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProcessVO [country=");
		builder.append(country);
		builder.append(", zipcode=");
		builder.append(zipcode);
		builder.append(", windZone=");
		builder.append(windZone);
		builder.append(", landType=");
		builder.append(landType);
		builder.append(", height=");
		builder.append(height);
		builder.append(", roofTileMfr=");
		builder.append(roofTileMfr);
		builder.append(", roofTile=");
		builder.append(roofTile);
		builder.append(", length=");
		builder.append(length);
		builder.append(", width=");
		builder.append(width);
		builder.append(", noOfTile=");
		builder.append(noOfTile);
		builder.append(", batten=");
		builder.append(batten);
		builder.append(", roofType=");
		builder.append(roofType);
		builder.append(", buildingHeight=");
		builder.append(buildingHeight);
		builder.append(", pitch=");
		builder.append(pitch);
		builder.append(", sizeA=");
		builder.append(sizeA);
		builder.append(", sizeB=");
		builder.append(sizeB);
		builder.append(", substrate=");
		builder.append(substrate);
		builder.append(", agree=");
		builder.append(agree);
		builder.append("]");
		return builder.toString();
	}
		
}
