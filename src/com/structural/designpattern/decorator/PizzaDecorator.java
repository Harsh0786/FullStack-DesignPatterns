package com.structural.designpattern.decorator;

public class PizzaDecorator implements Pizza{

	private Pizza pizza;
	
	PizzaDecorator(Pizza pizza){
		this.pizza=pizza;
	}
	
	@Override
	public void bakePizza() {
	pizza.bakePizza();
	}

	@Override
	public int cost() {
	
		return pizza.cost();
	}

}
