package com.structural.designpattern.facade;

public class OrderFacade {
private OrderProcessor orderProcessor = new OrderProcessor();

public void takeOrder(String device,int quantity){
	if(orderProcessor.checkStock(device, quantity)){
		orderProcessor.placeOrder(device, quantity);
		orderProcessor.shipOrder();
	}
}
}
