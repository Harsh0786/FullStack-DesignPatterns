package com.creational.designpattern.builder;

public class Pepsi extends ColdDrink {

	@Override
	public void item() {
	System.out.println("Pepsi");
	}

	@Override
	public int price() {
		return 30;
	}

}
