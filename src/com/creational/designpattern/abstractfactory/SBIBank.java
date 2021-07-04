package com.creational.designpattern.abstractfactory;

public class SBIBank implements Bank {

	@Override
	public void getBankName() {
		System.out.println("SBI Bank");
	}

}
