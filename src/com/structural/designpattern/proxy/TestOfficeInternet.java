package com.structural.designpattern.proxy;

public class TestOfficeInternet {

	public static void main(String[] args) {
	OfficeInternetAccess user1 = new ProxyInternetAccess("Rajesh");
	user1.grantInternetAccess();
	
	OfficeInternetAccess user2 = new ProxyInternetAccess("Roy");
	user2.grantInternetAccess();
	}

}
