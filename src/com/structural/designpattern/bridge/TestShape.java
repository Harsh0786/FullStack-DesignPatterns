package com.structural.designpattern.bridge;

public class TestShape {

	public static void main(String[] args) {
		Shape circle = new Circle(new RedColor());
		circle.shapeType();
		Shape square = new Square(new GreenColor());
		square.shapeType();
	}

}
