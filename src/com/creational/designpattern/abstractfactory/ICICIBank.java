package com.creational.designpattern.abstractfactory;

public class ICICIBank implements Bank {

	@Override
	public void getBankName() {
		System.out.println("ICICI Bank");
	}

}
