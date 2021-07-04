package com.structural.designpattern.proxy;

public class RealInternetAccess implements OfficeInternetAccess {

	String emplName;
	
	public RealInternetAccess(String emplName) {
		this.emplName=emplName;
	}
	
	@Override
	public void grantInternetAccess() {
	System.out.println("Grant access to employee - "+emplName);
	}

}
