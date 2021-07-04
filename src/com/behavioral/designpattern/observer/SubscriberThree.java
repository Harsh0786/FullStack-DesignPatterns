package com.behavioral.designpattern.observer;

public class SubscriberThree implements Observer {

	@Override
	public void getNotification(Message message) {
	System.out.println("Subscriber 3 notified with message - "+message.getMessage());
	}

}
