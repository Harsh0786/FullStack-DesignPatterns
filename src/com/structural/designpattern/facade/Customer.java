package com.structural.designpattern.facade;

public class Customer {

	public static void main(String[] args) {
	OrderFacade order1 = new OrderFacade();
	order1.takeOrder("Samsung", 4);
	}

}
