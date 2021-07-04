package com.structural.designpattern.flyweight;

public class Rectangle extends Shape {

	String shapeType;
	
	public String getShapeType() {
		return shapeType;
	}

	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}

	@Override
	public void draw(int radius) {
		}

	@Override
	public void draw(int length, int breadth) {
	System.out.println("Drawing a "+shapeType+" of length = "+length+" and breadth = "+breadth);	
	}

}
