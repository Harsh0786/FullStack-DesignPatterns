package com.creational.designpattern.singleton;

public class TestDoubleCheckedLockingSingleton {

	public static void main(String[] args) {
		DoubleCheckedLocking lazyobject1 = DoubleCheckedLocking.getInstance();
		DoubleCheckedLocking lazyobject2 = DoubleCheckedLocking.getInstance();
		lazyobject1.dummyMethod();
		System.out.println("Are two objects same ??? "+(lazyobject1==lazyobject2));
	}

}
