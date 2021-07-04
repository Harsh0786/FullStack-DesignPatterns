package com.creational.designpattern.abstractfactory;

public class HDFCBank implements Bank {

	@Override
	public void getBankName() {
		System.out.println("HDFC Bank");
	}

}
