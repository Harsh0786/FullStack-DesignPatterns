package com.behavioral.designpattern.mediator;

public abstract class User {

	protected ChatMediator chatMediator;
	protected String name;
	
	public String getName() {
		return name;
	}

	public User(ChatMediator chatMediator,String name){
		this.chatMediator=chatMediator;
		this.name=name;
	}
	
	public abstract void sendMessage(String msg);
	
	public abstract void receiveMessage(String msg);
}
