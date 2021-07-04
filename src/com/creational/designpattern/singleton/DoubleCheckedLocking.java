package com.creational.designpattern.singleton;

public class DoubleCheckedLocking {

	/*volatile is used to ensure mutliple threads handle single instance correctly*/
	private static volatile DoubleCheckedLocking instance;
	
	private DoubleCheckedLocking(){
		
	}
	
  /*1. check if variable is initialized or not
	2. obtain the lock
	3. double check if instance is already initialized by some other thread
	4. else initialize variable and return*/
	public static DoubleCheckedLocking getInstance(){
		if(instance==null){
			synchronized (DoubleCheckedLocking.class) {
				if(instance==null){
					instance = new DoubleCheckedLocking();
				}
			}
		}
		return instance;
	}
	
	public void dummyMethod(){
		System.out.println("Double Checked Locking example !!!");
	}
}
