package com.structural.designpattern.bridge;

public abstract class Shape {

	Color color;
	
	public Shape(Color color){
		this.color=color;
	}
	
	public abstract void shapeType();
}
