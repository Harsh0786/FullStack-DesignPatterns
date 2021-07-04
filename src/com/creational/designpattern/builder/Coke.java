package com.creational.designpattern.builder;

public class Coke extends ColdDrink {

	@Override
	public void item() {
	System.out.println("Coke");
	}

	@Override
	public int price() {
		return 40;
	}

}
