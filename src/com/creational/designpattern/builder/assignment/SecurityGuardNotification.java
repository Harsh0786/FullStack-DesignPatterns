package com.creational.designpattern.builder.assignment;

import java.util.ArrayList;
import java.util.List;

public class SecurityGuardNotification implements Notification {

	@Override
	public List<MeansOfNotification> sendNotification() {
		List<MeansOfNotification> means = new ArrayList<>();
		MeansOfNotification sms = new SMSMeansOfNotification();
		means.add(sms);
		return means;
	}

}
