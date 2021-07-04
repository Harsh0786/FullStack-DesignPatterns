package com.creational.designpattern.builder.assignment;

import java.util.ArrayList;
import java.util.List;

public class MembersNotification implements Notification {

	@Override
	public List<MeansOfNotification> sendNotification() {
		List<MeansOfNotification> means = new ArrayList<>();
		MeansOfNotification sms = new SMSMeansOfNotification();
		MeansOfNotification email = new EmailMeansOfNotification();
		means.add(sms);
		means.add(email);
		return means;
	}

}
