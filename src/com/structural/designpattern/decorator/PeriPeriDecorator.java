package com.structural.designpattern.decorator;

public class PeriPeriDecorator extends PizzaDecorator{

	PeriPeriDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void bakePizza() {
	super.bakePizza();
	System.out.println("Periperi  added!!!");
	}

	@Override
	public int cost() {
	int cost = super.cost()+50;
		return cost;
	}


}
