package com.creational.designpattern.abstractfactory;

public class LoanFactory implements FactoryType {

	@Override
	public Loan getLoan(String loanName) {
	Loan loan = null;
	if(loanName.equalsIgnoreCase("Home")){
		loan = new HomeLoan();
	}
	else if(loanName.equalsIgnoreCase("Car")){
		loan = new CarLoan();
	}
	else if(loanName.equalsIgnoreCase("Education")){
		loan = new EducationLoan();
	}
	return loan;
	}

	@Override
	public Bank getBank(String bankName) {
		return null;
	}



}
