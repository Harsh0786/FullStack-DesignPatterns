/**
 * 
 */
package com.creational.designpattern.singleton;

/**
 * @author harsh
 * Early Instantiation - Creation of object at load time
 * Also called Eager Instantiation
 */
public class EarlyInstantiation {
	
	/*private constructor*/
	private EarlyInstantiation(){
	}
	
	/*private static instance*/
	private static EarlyInstantiation instance = new EarlyInstantiation();
	
	/*public method to access object*/
	public static EarlyInstantiation getInstanceMethod(){
		return instance;
	}
	
	public void dummyMethod(){
		System.out.println("Printing message!!!");
	}

}
