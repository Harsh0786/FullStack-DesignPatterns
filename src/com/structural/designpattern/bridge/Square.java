package com.structural.designpattern.bridge;

public class Square extends Shape {

	public Square(Color color){
		super(color);
	}
	
	@Override
	public void shapeType() {
	System.out.println("Square Shape");
	color.fillColor();
	}

}
