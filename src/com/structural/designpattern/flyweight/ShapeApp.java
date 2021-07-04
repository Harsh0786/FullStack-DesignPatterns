package com.structural.designpattern.flyweight;

public class ShapeApp {

	public void returnShape(int count){
		Shape shape=null;
		for(int i=1;i<=count;i++){
			if(i%2==0){
				shape = ShapeFactory.renderShape("Circle");
				shape.draw(i);
				System.out.println("Printing hashcode for circle = "+shape.hashCode());
			}
			else{
				shape = ShapeFactory.renderShape("Rectangle");
				shape.draw(i, i+2);
				System.out.println("Printing hashcode for rectangle = "+shape.hashCode());
			}
		}
	}
}
