package com.creational.designpattern.builder;

public class PaneerBurger extends Burger {

	@Override
	public void item() {
		System.out.println("Paneer Burger");
	}

	@Override
	public int price() {
		return 120;
	}

}
