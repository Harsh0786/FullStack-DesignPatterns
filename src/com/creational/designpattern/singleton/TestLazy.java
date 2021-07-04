package com.creational.designpattern.singleton;

public class TestLazy {

	public static void main(String[] args) {
		LazyInstantiation lazyobject1 = LazyInstantiation.getInstance();
		LazyInstantiation lazyobject2 = LazyInstantiation.getInstance();
		lazyobject1.dummyMethod();
		System.out.println("Are two objects same ??? "+(lazyobject1==lazyobject2));
	}

}
