package com.behavioral.designpattern.observer;

public class SubscriberTwo implements Observer {

	@Override
	public void getNotification(Message message) {
	System.out.println("Subscriber 2 notified with message - "+message.getMessage());
	}

}
