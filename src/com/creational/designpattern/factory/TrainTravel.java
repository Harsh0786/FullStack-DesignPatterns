package com.creational.designpattern.factory;

public class TrainTravel implements Travel {

	@Override
	public int duration() {
		return 10;
	}

	@Override
	public int fare() {
		return 450;
	}

	@Override
	public String carrierName() {
		return "Indore Pune Express";
	}

}
