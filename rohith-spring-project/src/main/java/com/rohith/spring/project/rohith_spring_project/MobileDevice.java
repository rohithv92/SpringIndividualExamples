package com.rohith.spring.project.rohith_spring_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohith.spring.project.rohith_spring_project.builder.Person;

public class MobileDevice {

	public static void main(String []args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("\n*****Loading beans successfull*****");
		Person person = context.getBean("person",Person.class);
		person.displayPersonInfo();

		
	}
}
