package com.rohith.spring.ioc.rohith_spring_ioc.device;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rohith.spring.ioc.rohith_spring_ioc.Sim;



public class Mobile {
	
	public static void main (String[]args)
	{	
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/rv051834/workspace/rohith-spring-ioc/src/main/resources/spring/beans.xml");
		System.out.println("config load");
		Sim sim = context.getBean("Sim", Sim.class);
		sim.calling();
		sim.data();
				
	}
	
}
