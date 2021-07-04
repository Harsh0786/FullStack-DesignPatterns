package com.creational.designpattern.builder.assignment;

public class Test {

	public static void main(String[] args) {
	NotificationFactory factory1 = new NotificationFactory();
	factory1.notifyAll("Individual");
	System.out.println("**************");
	NotificationFactory factory2 = new NotificationFactory();
	factory2.notifyAll("Coaching");
	System.out.println("**************");
	NotificationFactory factory3 = new NotificationFactory();
	factory3.notifyAll("LifeTime");
	
	}

}
