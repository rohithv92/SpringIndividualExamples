package com.rohith.spring.di.rohith_spring_di;

public class Address {
	
	private String location;
	
	private String pincode;
	
	public void setLocation(String location) {
		this.location = location;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public void displayAddress()
	{
		System.out.println("Address details location : "+location +
				"  pincode   : "+ pincode);
	}


}
