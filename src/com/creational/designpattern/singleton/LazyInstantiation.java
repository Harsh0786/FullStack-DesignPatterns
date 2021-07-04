package com.creational.designpattern.singleton;

import java.io.Serializable;

/**
 * @author harsh
 * Lazy Instantiation - Creation of object when required
 */
public class LazyInstantiation implements Serializable,Cloneable{

	private static final long serialVersionUID = 1L;
	/*Declaring variable of return type same as that of class*/
	private static LazyInstantiation instance;
	
	/*private constructor*/
	private LazyInstantiation(){
		
	}
	
	/*public static method to access object
	 * object instantiated at run time only if it is null*/
	public static LazyInstantiation getInstance(){
		if(instance==null){
			System.out.println("Instance created lazily");
			instance = new LazyInstantiation();
		}
		return instance;
	}
	
	public void dummyMethod(){
		System.out.println("Hello World!!!");
	}
	
	
	protected Object readResolve(){
		return instance;
	}
	
	@Override
	protected Object clone(){
		return new CloneNotSupportedException();
	}

}
