package com.structural.designpattern.bridge;

public abstract class Vehicle {
	
	Workshop workshop1;
	Workshop workshop2;
	
	public Vehicle(Workshop workshop1,Workshop workshop2){
		this.workshop1=workshop1;
		this.workshop2=workshop2;
	}

	public abstract void typeOfVehicle();
	
}
