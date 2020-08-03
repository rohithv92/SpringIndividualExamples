package com.rohith.spring.project.rohith_spring_project.subscriber.impl;

import java.util.List;

import com.rohith.spring.project.rohith_spring_project.intrface.Service;
import com.rohith.spring.project.rohith_spring_project.intrface.Sim;

public class VodaphoneSubscriber implements Sim {

	private List<Service> services;

public List<Service> getServices() {
	System.out.println("List of service :"  + services);
		return services;
	}



public void setServices(List<Service> services) {
		this.services = services;
	}


	public void subscriber() {
		
		System.out.println("You are an Vodaphone subscriber");
		getServices();
		yourServices();
		
	}
	
	public void yourServices() {

		for(int i=0; i<services.size();i++)
		{
			services.get(i).services();
		}
		
	}

}
