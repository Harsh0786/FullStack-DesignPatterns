package com.creational.designpattern.factory;

public class BusTravel implements Travel {

	@Override
	public int duration() {
		return 12;
	}

	@Override
	public int fare() {
		return 1500;
	}

	@Override
	public String carrierName() {
		return "Ashok Travels";
	}

}
