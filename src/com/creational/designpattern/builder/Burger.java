package com.creational.designpattern.builder;

public abstract class Burger implements Item {

	@Override
	public Packing getPacking(){
		return new Wrapper();
	}
}
