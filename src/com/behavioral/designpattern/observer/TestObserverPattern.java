package com.behavioral.designpattern.observer;

public class TestObserverPattern {

	public static void main(String[] args) {
	Observer sub1 = new SubscriberOne();
	Observer sub2 = new SubscriberTwo();
	Observer sub3 = new SubscriberThree();
	
	Publisher publish = new PublisherImplementation();
	
	publish.addSubscriber(sub1);
	publish.addSubscriber(sub2);
	
	publish.notifyAllSubscribers(new Message("First tutorial video shared!!!"));
	
	publish.removeSubscriber(sub2);
	publish.addSubscriber(sub3);
	
	publish.notifyAllSubscribers(new Message("Second tutorial video shared!!!"));
	}

}
