package com.behavioral.designpattern.interpreter;

public class AndExpression implements Expression {

	Expression  it1;
	Expression it2;
	
	
	
	public AndExpression(Expression it1, Expression it2) {
		this.it1 = it1;
		this.it2 = it2;
	}



	@Override
	public boolean express(String context) {
	return it1.express(context) && it2.express(context);
	}

}
