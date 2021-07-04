package com.behavioral.designpattern.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
	Stock share1 = new Stock();
	
	BuyStock buy = new BuyStock(share1);
	
	Broker broker = new Broker();
	broker.takeOrder(buy);
	broker.placeOrders();
	}

}
