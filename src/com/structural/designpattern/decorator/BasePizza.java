package com.structural.designpattern.decorator;

public  class BasePizza implements Pizza{

@Override
public void bakePizza()
{
	System.out.println("Pan Pizza baked");
}
	
@Override
	public int cost(){
	return 50;
}

}
