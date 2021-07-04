package com.structural.designpattern.bridge;

public class Car extends Vehicle {

	Car(Workshop w1, Workshop w2){
		super(w1,w2);
	}
	
	@Override
	public void typeOfVehicle() {
	System.out.println("Its a car");
	workshop1.work();
	workshop2.work();
	}

}
