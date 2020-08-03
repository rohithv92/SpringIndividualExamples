package com.rohith.spring.di.rohith_spring_di;

public class Student {

	private String studentName;
	private int id;
	private Address address;
	private Education education;



	// //Use setters for setter injection
	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setEducation(Education education) {
		this.education = education;
	}

	// public Student(String studentName, int id) {
	// this.studentName = studentName;
	// this.id = id;
	// }
	//
	// public Student(int id) {
	// this.id = id;
	// }

	public void displayStudentInfo() {
		System.out.println("Student name is : " + studentName);
		System.out.println("Student id is : " + id);
		address.displayAddress();
		education.displayEducation();
	}

}
