package com.structural.designpattern.adapter;

public class PaymentApp {

	public static void main(String[] args) {
		PaymentAdapter adapter = new PaymentAdapter();
		adapter.pay(10000);
	}

}
