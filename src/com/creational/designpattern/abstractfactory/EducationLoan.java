package com.creational.designpattern.abstractfactory;

public class EducationLoan implements Loan {

	@Override
	public void getLoanType() {
		System.out.println("Education Loan");
	}

}
