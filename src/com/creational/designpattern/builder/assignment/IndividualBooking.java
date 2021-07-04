package com.creational.designpattern.builder.assignment;

import java.util.ArrayList;
import java.util.List;

public class IndividualBooking implements Booking {

	@Override
	public List<PersonType> notifyFollowingPersons() {
		List<PersonType> persons = new ArrayList<>();
		PersonType security = new SecurityGuard();
		PersonType member = new Member();
		persons.add(security);
		persons.add(member);
		return persons;
	}

}
