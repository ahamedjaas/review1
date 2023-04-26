package com.example.demo.AreaModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity


public class AreaDetails {
	@Id
	private int id;
	private String Areaname;
	private String District;
	private int Pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAreaname() {
		return Areaname;
	}
	public void setAreaname(String areaname) {
		Areaname = areaname;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "AreaDetails [id=" + id + ", Areaname=" + Areaname + ", District=" + District + ", Pincode=" + Pincode
				+ "]";
	}
}
	
