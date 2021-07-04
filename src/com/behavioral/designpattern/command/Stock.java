package com.behavioral.designpattern.command;

public class Stock {

	private String stockName = "PNB Bank";
	private int quantity = 245;
	
	public void buy(){
		System.out.println("Buy stock - Company name - "+stockName+" and quantity - "+quantity);
	}
	
	public void sell(){
		System.out.println("Sell stock - Company name - "+stockName+" and quantity - "+quantity);
	}
}
