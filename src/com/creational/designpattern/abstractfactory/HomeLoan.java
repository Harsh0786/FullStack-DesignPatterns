package com.creational.designpattern.abstractfactory;

public class HomeLoan implements Loan {

	@Override
	public void getLoanType() {
		System.out.println("Home Loan");
	}

}
