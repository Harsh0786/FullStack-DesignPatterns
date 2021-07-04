package com.creational.designpattern.singleton;

public class LoggerTest {

	public static void main(String[] args) {
		Logger log1 = Logger.getInstance();
		Logger log2 = Logger.getInstance();
		log1.log("Hello World!!!");
		log2.log("Welcome to Java");
		
		System.out.println("Are these 2 object same ?"+(log1==log2));
	}

}
