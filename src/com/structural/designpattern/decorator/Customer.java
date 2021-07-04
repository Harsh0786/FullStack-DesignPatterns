package com.structural.designpattern.decorator;

public class Customer {

	public static void main(String[] args) {
		Pizza pizza1 = new CheeseBurstDecorator(new BasePizza());
		pizza1.bakePizza();
		System.out.println("Total Price - "+pizza1.cost());
	}

}
