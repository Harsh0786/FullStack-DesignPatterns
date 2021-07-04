package com.structural.designpattern.bridge;

public class Circle extends Shape {

	public Circle(Color color){
		super(color);
	}
	
	@Override
	public void shapeType() {
	System.out.println("Circle Shape");
	color.fillColor();
	}

}
