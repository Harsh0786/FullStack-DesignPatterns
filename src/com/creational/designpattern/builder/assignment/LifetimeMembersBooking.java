package com.creational.designpattern.builder.assignment;

import java.util.ArrayList;
import java.util.List;

public class LifetimeMembersBooking implements Booking {

	@Override
	public List<PersonType> notifyFollowingPersons() {
		List<PersonType> persons = new ArrayList<>();
		PersonType security = new SecurityGuard();
		PersonType member = new Member();
		PersonType coach = new Coach();
		PersonType manager = new FacilityManager();
		persons.add(security);
		persons.add(member);
		persons.add(coach);
		persons.add(manager);
		return persons;
	}

}
