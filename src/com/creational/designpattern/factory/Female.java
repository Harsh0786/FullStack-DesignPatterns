package com.creational.designpattern.factory;

public class Female implements Person {

	@Override
	public void wish(String msg) {
		System.out.println("Wish of a female : "+msg);
	}

}
