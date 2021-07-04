package com.creational.designpattern.builder.assignment;

public class SMSMeansOfNotification implements MeansOfNotification {

	@Override
	public String howToNotify() {
		return "Sending SMS...";
	}

}
