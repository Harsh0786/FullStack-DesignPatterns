package com.behavioral.designpattern.template;

public abstract class ComputerManufaturer {

	public final void buildComputer(){
		System.out.println("Computer configuration are -"+" Hard Disk : "+addHardDisk()+", RAM size : "+addRAM()+", Keyboard type : "+addKeyBoard());
	}
	
	public abstract String addHardDisk();
	
	public abstract String addRAM();
	
	public abstract String addKeyBoard();
}
