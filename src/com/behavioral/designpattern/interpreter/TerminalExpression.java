package com.behavioral.designpattern.interpreter;

public class TerminalExpression implements Expression {

	private String data;
	
	TerminalExpression(String data){
		this.data=data;
	}
	
	@Override
	public boolean express(String context) {
	if(context.contains(data)){
		return true;
	}
	return false;
	}

}
