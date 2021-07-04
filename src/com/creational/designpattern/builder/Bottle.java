package com.creational.designpattern.builder;

public class Bottle implements Packing {

	@Override
	public void pack() {
		System.out.println("Pour it in the bottle!!!");
	}

}
