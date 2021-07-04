package com.behavioral.designpattern.mediator;

public class ChatApplication {

	public static void main(String[] args) {
	ChatMediator mediator = new ChatMediatorImpl();
	User user1 = new UserImpl(mediator, "Raj");
	User user2 = new UserImpl(mediator, "Bhuvan");
	User user3 = new UserImpl(mediator, "Rajeev");
	User user4 = new UserImpl(mediator, "Bhuvani");
	mediator.addUser(user1);
	mediator.addUser(user2);
	mediator.addUser(user3);
	mediator.addUser(user4);
	user1.sendMessage("Hello Friends");
	System.out.println("--------------");
	user4.sendMessage("Hello Raj");
}

}
