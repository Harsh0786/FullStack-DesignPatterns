package com.behavioral.designpattern.template;

public class TestComputerManufacturing {

	public static void main(String[] args) {
	ComputerManufaturer laptopManufacture = new LaptopManufacturer();
	laptopManufacture.buildComputer();
	
	ComputerManufaturer desktopManufacture = new DesktopManufacturer();
	desktopManufacture.buildComputer();
	}

}
