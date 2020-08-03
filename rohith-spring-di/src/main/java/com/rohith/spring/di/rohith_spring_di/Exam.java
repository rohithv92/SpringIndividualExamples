package com.rohith.spring.di.rohith_spring_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Exam {

	public static void main (String[] args)
	{
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/rv051834/workspace/rohith-spring-di/src/main/resources/spring/beans.xml");
		Student student = context.getBean("RohithStudent",Student.class);
		student.displayStudentInfo();
		
		Student student2 = context.getBean("SamStudent",Student.class);
		student2.displayStudentInfo();
		
	}
}
