package com.behavioral.designpattern.observer;

public interface Publisher {

	void addSubscriber(Observer o);
	void removeSubscriber(Observer o);
	void notifyAllSubscribers(Message message);
}
