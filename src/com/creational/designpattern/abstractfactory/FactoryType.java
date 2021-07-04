package com.creational.designpattern.abstractfactory;

public interface FactoryType {

	Loan getLoan(String loanName);
	
	Bank getBank(String bankName);
}
