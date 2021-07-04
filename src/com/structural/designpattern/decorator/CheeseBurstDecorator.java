package com.structural.designpattern.decorator;

public class CheeseBurstDecorator extends PizzaDecorator{

	CheeseBurstDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void bakePizza() {
	super.bakePizza();
	System.out.println("CheeseBurst added!!!");
	}

	@Override
	public int cost() {
	int cost = super.cost()+150;
		return cost;
	}


}
