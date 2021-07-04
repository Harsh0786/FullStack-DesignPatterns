package com.behavioral.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	List<User> userList = new ArrayList<>();
	
	@Override
	public void sendingMessage(String message, User user) {
	for(User u:userList){
		if(!u.getName().equals(user.getName())){
			u.receiveMessage(message);
		}
	}
	}

	@Override
	public void addUser(User user) {
		userList.add(user);
		}

}
