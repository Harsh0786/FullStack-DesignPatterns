package com.creational.designpattern.builder;

public abstract class ColdDrink implements Item {

	@Override
	public Packing getPacking() {
		return new Bottle();
	}

}
