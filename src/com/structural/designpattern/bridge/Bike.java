package com.structural.designpattern.bridge;

public class Bike extends Vehicle {

	
	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void typeOfVehicle() {
		System.out.println("Its a bike");
		workshop1.work();
		workshop2.work();
	}

}
