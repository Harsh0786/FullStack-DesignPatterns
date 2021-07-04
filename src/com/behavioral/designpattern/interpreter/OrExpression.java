package com.behavioral.designpattern.interpreter;

public class OrExpression implements Expression {

	Expression  it1;
	Expression it2;
	
	
	
	public OrExpression(Expression it1, Expression it2) {
		this.it1 = it1;
		this.it2 = it2;
	}



	@Override
	public boolean express(String context) {
	return it1.express(context) || it2.express(context);
	}

}
