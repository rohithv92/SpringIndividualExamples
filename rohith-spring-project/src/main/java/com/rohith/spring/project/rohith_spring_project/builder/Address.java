package com.rohith.spring.project.rohith_spring_project.builder;

public class Address {

	private String addressInfo;
	private int pincode;

	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void displayAddress() {
		System.out.println("Address info  : " + addressInfo + "\npincode : " + pincode);
	}
}
