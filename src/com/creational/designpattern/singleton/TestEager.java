package com.creational.designpattern.singleton;

public class TestEager {

	public static void main(String[] args) {
	EarlyInstantiation instance1 = EarlyInstantiation.getInstanceMethod();
	instance1.dummyMethod();
	EarlyInstantiation instance2 = EarlyInstantiation.getInstanceMethod();
	System.out.println("Are both objects same ?? "+(instance1==instance2));
	}

}
