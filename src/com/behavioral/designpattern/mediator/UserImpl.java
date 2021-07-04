package com.behavioral.designpattern.mediator;

public class UserImpl extends User {

	
	public UserImpl(ChatMediator chatMediator, String name) {
		super(chatMediator, name);
	}

	@Override
	public void sendMessage(String msg) {
	System.out.println(this.name+" sending the message : "+msg);
	chatMediator.sendingMessage(msg, this);
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println(this.name+" receiving the message : "+msg);
		}

}
