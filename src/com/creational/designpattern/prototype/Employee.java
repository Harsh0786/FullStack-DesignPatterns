package com.creational.designpattern.prototype;

public class Employee implements CloneEmployee {

	int empId;
	String empName;
	String empDesignation;
	
	public Employee(int empId, String empName, String empDesignation){
		this.empId=empId;
		this.empName=empName;
		this.empDesignation=empDesignation;
	}

	@Override
	public Employee createEmployeeClone() {
		return new Employee(empId,empName,empDesignation);
	}
	
	public void showEmployeeDetails(){
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Designation : "+empDesignation);
	}
	
	
}
