package com.creational.designpattern.factory;

public class PersonWish {
	
	public void getPersonWishesBasedOnGender(String gender,String msg){
	Person p = PersonFactory.createPerson(gender);
	p.wish(msg);
	}
}
