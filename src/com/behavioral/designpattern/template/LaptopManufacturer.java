package com.behavioral.designpattern.template;

public class LaptopManufacturer extends ComputerManufaturer {

	@Override
	public String addHardDisk() {
		return "1 TB";
	}

	@Override
	public String addRAM() {
		return "64-bit";
	}

	@Override
	public String addKeyBoard() {
		return "Laptop Keyboard";
	}

}
