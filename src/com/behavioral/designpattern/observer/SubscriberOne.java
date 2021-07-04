package com.behavioral.designpattern.observer;

public class SubscriberOne implements Observer {

	@Override
	public void getNotification(Message message) {
	System.out.println("Subscriber 1 notified with message - "+message.getMessage());
	}

}
