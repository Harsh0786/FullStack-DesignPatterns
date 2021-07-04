package com.creational.designpattern.factory;

public class Test {

	public static void main(String[] args) {
		PersonWish person1 = new PersonWish();
		person1.getPersonWishesBasedOnGender("Male", "Car");
		System.out.println("---------");
		PersonWish person2 = new PersonWish();
		person2.getPersonWishesBasedOnGender("Female", "Jewellery");
	}

}
