package com.creational.designpattern.abstractfactory;

public class FetchBankAndLoanObjects {

	public static FactoryType getFactoryObject(String type){
		FactoryType factory = null;
		if(type.equals("Bank")){
			factory = new BankFactory();
		}
		else if(type.equals("Loan")){
			factory = new LoanFactory();
		}
		
		return factory;
	}
}
