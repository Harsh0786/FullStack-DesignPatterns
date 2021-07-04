package com.structural.designpattern.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {

	private String empName;
	
	public ProxyInternetAccess(String empName) {
	this.empName=empName;
	}
	
	@Override
	public void grantInternetAccess() {
	if(grantRole(empName)>5){
		RealInternetAccess realInternet = new RealInternetAccess(empName);
		realInternet.grantInternetAccess();
	}else
	{
		System.out.println("No internet access granted for "+empName);
	}
	}
	
	public int grantRole(String empName){
		return empName.length();
	}

}
