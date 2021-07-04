package com.structural.designpattern.facade;

public class OrderProcessor {
	
	public boolean checkStock(String device,int quantity){
		if(device.equals("Iphone") && quantity<=10){
			return true;
		}
		if(device.equals("Samsung") && quantity<=20){
			return true;
		}
		return false;
	}
	
	public void placeOrder(String device,int quantity){
		System.out.println("Your order for "+quantity+" "+device+" phones has been successfully placed");
	}
	
	public void shipOrder(){
		System.out.println("Order is successfully shipped");
	}

}
