package com.creational.designpattern.factory;

public class PersonFactory {

	public static Person createPerson(String gender){
		Person p = null;
		if(gender.equalsIgnoreCase("MALE")){
			p = new Male();
		}else if(gender.equalsIgnoreCase("FEMALE")){
			p = new Female();
		}
		return p;		
	}
}
