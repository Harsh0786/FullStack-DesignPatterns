package com.behavioral.designpattern.mediator;

public interface ChatMediator {

	void sendingMessage(String message,User user);
	void addUser(User user);
}
