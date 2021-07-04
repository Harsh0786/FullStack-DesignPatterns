package com.structural.designpattern.adapter;

public class PaymentAdapter {

	public void pay(int rupees){
		int dollar = rupees/74;
		PaymentProcessor payInDollars = new PaymentProcessorImpl();
		payInDollars.pay(dollar);
	}
}
