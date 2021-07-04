package com.structural.designpattern.adapter;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(int dollars) {
		System.out.println("Paid in Dollars !!!"+dollars);
	}

}
