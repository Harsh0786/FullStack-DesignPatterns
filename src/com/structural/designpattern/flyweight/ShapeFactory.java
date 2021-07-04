package com.structural.designpattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {

	static HashMap<String,Shape> shapeMap = new HashMap<>();
	public static Shape renderShape(String shapeType){
		
		Shape shape;
		if(shapeMap.get(shapeType)!=null){
			shape=shapeMap.get(shapeType);
		}
		else{
			if(shapeType.equals("Circle")){
				shape = new Circle();
			}
			else{
				shape = new Rectangle();
			}
			shapeMap.put(shapeType, shape);
		}
		return shape;
	}
}
