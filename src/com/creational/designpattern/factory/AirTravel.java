package com.creational.designpattern.factory;

public class AirTravel implements Travel {

	@Override
	public int duration() {
		return 4;
	}

	@Override
	public int fare() {
		return 5400;
	}

	@Override
	public String carrierName() {
		return "Indigo Airways";
	}

}
