package com.creational.designpattern.builder;


public class PrepareMeal {
	
	public BuildAnOrder createVegMeal(){
		BuildAnOrder vegMeal = new BuildAnOrder();
		vegMeal.addItems(new VeggieBurger());
		vegMeal.addItems(new Pepsi());
		
		return vegMeal;
	}
	
	public BuildAnOrder createPaneerMeal(){
		BuildAnOrder paneerMeal = new BuildAnOrder();
		paneerMeal.addItems(new PaneerBurger());
		paneerMeal.addItems(new Coke());
		
		return paneerMeal;
	}

}
