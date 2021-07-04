package com.structural.designpattern.decorator;

public class PannerDecorator extends PizzaDecorator{

	PannerDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void bakePizza() {
	super.bakePizza();
	System.out.println("Panner Toppings added!!!");
	}

	@Override
	public int cost() {
	int cost = super.cost()+100;
		return cost;
	}


}
