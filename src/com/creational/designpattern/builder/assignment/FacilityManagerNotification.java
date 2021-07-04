package com.creational.designpattern.builder.assignment;

import java.util.ArrayList;
import java.util.List;

public class FacilityManagerNotification implements Notification {

	@Override
	public List<MeansOfNotification> sendNotification() {
		List<MeansOfNotification> means = new ArrayList<>();
		MeansOfNotification email = new EmailMeansOfNotification();
		means.add(email);
		return means;
	}

}
