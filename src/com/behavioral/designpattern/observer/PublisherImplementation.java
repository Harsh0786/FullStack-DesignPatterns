package com.behavioral.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherImplementation implements Publisher {

	List<Observer> subscribersList = new ArrayList<>();
	
	@Override
	public void addSubscriber(Observer o) {
		subscribersList.add(o);
		}

	@Override
	public void removeSubscriber(Observer o) {
		subscribersList.remove(o);
		}

	@Override
	public void notifyAllSubscribers(Message message) {
		for(Observer subs : subscribersList){
			subs.getNotification(message);
		}
		}

}
