package com.creational.designpattern.abstractfactory;

public class Customer {

	public static void main(String[] args) {
	FetchBankAndLoanObjects customer = new FetchBankAndLoanObjects();
	FactoryType loanfactory = customer.getFactoryObject("Loan");
	Loan loan = loanfactory.getLoan("Car");
	FactoryType bankFactory = customer.getFactoryObject("Bank");
	Bank bank = bankFactory.getBank("SBI");
	loan.getLoanType();
	bank.getBankName();
	}

}
