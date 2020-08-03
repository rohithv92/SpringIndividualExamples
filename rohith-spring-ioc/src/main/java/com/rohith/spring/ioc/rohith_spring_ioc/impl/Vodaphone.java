package com.rohith.spring.ioc.rohith_spring_ioc.impl;

import com.rohith.spring.ioc.rohith_spring_ioc.Sim;

public class Vodaphone implements Sim{
	
	public Vodaphone()
	{
		System.out.println("Vodaphone constructor");
	}

	public void calling() {
		System.out.println("Calling using Vodaphone sim");
		
	}

	public void data() {
		System.out.println("Data using Vodaphone sim");
		
	}

}
