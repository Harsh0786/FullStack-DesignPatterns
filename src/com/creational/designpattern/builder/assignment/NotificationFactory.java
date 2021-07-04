package com.creational.designpattern.builder.assignment;

import java.util.List;

public class NotificationFactory {

	public void notifyAll(String bookingType){
		if(bookingType.equalsIgnoreCase("Individual")){
			System.out.println("----------INDIVIDUAL BOOKING ---------");
			IndividualBooking individuals = new IndividualBooking();
			List<PersonType> persons = individuals.notifyFollowingPersons();
			for(PersonType person : persons){
				System.out.println(person.personRole());
			if(person.personRole().contains("security")){
				Notification notifySecurity = new SecurityGuardNotification();
				List<MeansOfNotification> notification = notifySecurity.sendNotification();
			for(MeansOfNotification notify : notification){
				System.out.println(notify.howToNotify());
			}
			System.out.println("------");
			} else if(person.personRole().contains("member")){
				Notification notifyMember = new MembersNotification();
				List<MeansOfNotification> notification = notifyMember.sendNotification();
			for(MeansOfNotification notify : notification){
				System.out.println(notify.howToNotify());
			}
			System.out.println("------");
			}
			else if(person.personRole().contains("coach")){
				Notification notifyCoach = new CoachNotification();
				List<MeansOfNotification> notification = notifyCoach.sendNotification();
			for(MeansOfNotification notify : notification){
				System.out.println(notify.howToNotify());
			}
			System.out.println("------");
			}
			else if(person.personRole().contains("manager")){
				Notification notifyManager = new FacilityManagerNotification();
				List<MeansOfNotification> notification = notifyManager.sendNotification();
			for(MeansOfNotification notify : notification){
				System.out.println(notify.howToNotify());
			}
			System.out.println("------");
			}
			}
		}
		else if(bookingType.equalsIgnoreCase("Coaching")){
			System.out.println("----------COACHING SESSION ---------");
			CoachingSession coaching = new CoachingSession();
			List<PersonType> persons = coaching.notifyFollowingPersons();
			for(PersonType person : persons){
				System.out.println(person.personRole());
				if(person.personRole().contains("security")){
					Notification notifySecurity = new SecurityGuardNotification();
					List<MeansOfNotification> notification = notifySecurity.sendNotification();
				for(MeansOfNotification notify : notification){
					System.out.println(notify.howToNotify());
				}
				System.out.println("------");
				} else if(person.personRole().contains("member")){
					Notification notifyMember = new MembersNotification();
					List<MeansOfNotification> notification = notifyMember.sendNotification();
				for(MeansOfNotification notify : notification){
					System.out.println(notify.howToNotify());
				}
				System.out.println("------");
				}
				else if(person.personRole().contains("coach")){
					Notification notifyCoach = new CoachNotification();
					List<MeansOfNotification> notification = notifyCoach.sendNotification();
				for(MeansOfNotification notify : notification){
					System.out.println(notify.howToNotify());
				}
				System.out.println("------");
				}
				else if(person.personRole().contains("manager")){
					Notification notifyManager = new FacilityManagerNotification();
					List<MeansOfNotification> notification = notifyManager.sendNotification();
				for(MeansOfNotification notify : notification){
					System.out.println(notify.howToNotify());
				}
				System.out.println("------");
				}
				
			}
		}
		else if(bookingType.equalsIgnoreCase("LifeTime")){
			System.out.println("----------LIFETIME MEMBER BOOKING ---------");
			LifetimeMembersBooking lifetimeMembers = new LifetimeMembersBooking();
			List<PersonType> persons = lifetimeMembers.notifyFollowingPersons();
			for(PersonType person : persons){
				System.out.println(person.personRole());
				if(person.personRole().contains("security")){
					Notification notifySecurity = new SecurityGuardNotification();
					List<MeansOfNotification> notification = notifySecurity.sendNotification();
				for(MeansOfNotification notify : notification){
					System.out.println(notify.howToNotify());
				}
				System.out.println("------");
				} else if(person.personRole().contains("member")){
					Notification notifyMember = new MembersNotification();
					List<MeansOfNotification> notification = notifyMember.sendNotification();
				for(MeansOfNotification notify : notification){
					System.out.println(notify.howToNotify());
				}
				System.out.println("------");
				}
				else if(person.personRole().contains("coach")){
					Notification notifyCoach = new CoachNotification();
					List<MeansOfNotification> notification = notifyCoach.sendNotification();
				for(MeansOfNotification notify : notification){
					System.out.println(notify.howToNotify());
				}
				System.out.println("------");
				}
				else if(person.personRole().contains("manager")){
					Notification notifyManager = new FacilityManagerNotification();
					List<MeansOfNotification> notification = notifyManager.sendNotification();
				for(MeansOfNotification notify : notification){
					System.out.println(notify.howToNotify());
				}
				System.out.println("------");
				}
				
			}
		}
			
	}
	
}
