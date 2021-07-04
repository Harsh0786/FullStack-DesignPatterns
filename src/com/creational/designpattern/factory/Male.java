package com.creational.designpattern.factory;

public class Male implements Person {

	@Override
	public void wish(String msg) {
		System.out.println("Wish of a male : "+msg);
	}

}
