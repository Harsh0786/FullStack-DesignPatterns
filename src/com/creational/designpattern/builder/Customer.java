package com.creational.designpattern.builder;

public class Customer {

	public static void main(String[] args) {
	System.out.println("Veg Combo");
	PrepareMeal customer1 = new PrepareMeal();
	BuildAnOrder vegMeal = customer1.createVegMeal();
	vegMeal.showItems();
	System.out.println("Total Bill : "+vegMeal.getBill());
	System.out.println("------------");
	System.out.println("Paneer Combo");
	PrepareMeal customer2 = new PrepareMeal();
	BuildAnOrder paneerMeal = customer2.createPaneerMeal();
	paneerMeal.showItems();
	System.out.println("Total Bill : "+paneerMeal.getBill());
	System.out.println("------------");
	
	}

}
