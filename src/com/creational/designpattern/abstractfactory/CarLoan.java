package com.creational.designpattern.abstractfactory;

public class CarLoan implements Loan {

	@Override
	public void getLoanType() {
		System.out.println("Car Loan");
	}

}
