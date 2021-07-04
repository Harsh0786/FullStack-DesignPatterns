package com.creational.designpattern.prototype;

public class Test {

	public static void main(String[] args) {
	Employee emp1 = new Employee(1,"Harsh","Software Development Specialist");
	emp1.showEmployeeDetails();
	System.out.println("************");
	Employee emp2 = emp1.createEmployeeClone();
	emp2.showEmployeeDetails();
	System.out.println("************");
	System.out.println("Are two objects equals - "+emp1.equals(emp2));
	System.out.println("Are two objects same - "+(emp1==emp2));
	}

}
