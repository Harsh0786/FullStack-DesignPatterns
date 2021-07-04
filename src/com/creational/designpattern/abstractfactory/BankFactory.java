package com.creational.designpattern.abstractfactory;

public class BankFactory implements FactoryType {

	@Override
	public Loan getLoan(String loanName) {
	return null;
	}

	@Override
	public Bank getBank(String bankName) {
		Bank bank=null;
		if(bankName.equalsIgnoreCase("ICICI")){
			bank = new ICICIBank();
		}
		else if(bankName.equalsIgnoreCase("HDFC")){
			bank = new HDFCBank();
		}
		else if(bankName.equalsIgnoreCase("SBI")){
			bank = new SBIBank();
		}
		return bank;
	}



}
