package com.structural.designpattern.flyweight;

public class Circle extends Shape {

	String shapeType;
	
	public String getShapeType() {
		return shapeType;
	}

	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}

	@Override
		public void draw(int radius) {
	System.out.println("Drawing a "+shapeType+" of radius = "+radius);	
	}

	@Override
	public void draw(int length, int breadth) {
		// TODO Auto-generated method stub
		
	}

	
}
