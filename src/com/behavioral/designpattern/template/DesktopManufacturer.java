package com.behavioral.designpattern.template;

public class DesktopManufacturer extends ComputerManufaturer {

	@Override
	public String addHardDisk() {
		return "256GB";
	}

	@Override
	public String addRAM() {
		// TODO Auto-generated method stub
		return "32-bit";
	}

	@Override
	public String addKeyBoard() {
		// TODO Auto-generated method stub
		return "Desktop Keyboard";
	}

}
