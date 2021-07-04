package com.creational.designpattern.builder.assignment;

public class EmailMeansOfNotification implements MeansOfNotification {

	@Override
	public String howToNotify() {
		return "Sending Email...";
	}

}
