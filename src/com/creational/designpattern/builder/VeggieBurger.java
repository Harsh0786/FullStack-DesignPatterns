package com.creational.designpattern.builder;

public class VeggieBurger extends Burger {

	@Override
	public void item() {
		System.out.println("Veg Burger");
	}

	@Override
	public int price() {
		return 80;
	}

}
