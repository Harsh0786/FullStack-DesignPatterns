package com.structural.designpattern.bridge;

public class Customer {

	public static void main(String[] args) {
Vehicle car = new Car(new Produce(), new Assemble());
car.typeOfVehicle();
	}

}
