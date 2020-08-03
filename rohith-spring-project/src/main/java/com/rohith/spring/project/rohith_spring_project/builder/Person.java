package com.rohith.spring.project.rohith_spring_project.builder;

import org.springframework.beans.factory.annotation.Autowired;

import com.rohith.spring.project.rohith_spring_project.intrface.Sim;

public class Person {

	private String personName;
	private String personAge;
	private Address address;
	private Sim sim;

//	public Person() {
//	}
//	
//	@Autowired
//	public Person(Address address) {
//		//this.personName = personName;
//		//this.personAge = personAge;
//		this.address = address;
//		//this.sim = sim;
//	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void displayPersonInfo() {
		System.out.println("Person info  name : " + personName + "\nage : " + personAge);
		address.displayAddress();
		sim.subscriber();
	}

}
