package com.behavioral.designpattern.interpreter;

public class Test {

	
	public static Expression getMaleInterpretation(){
		Expression ram = new TerminalExpression("Ram");
		Expression krishna = new TerminalExpression("Krishna");
		return new OrExpression(ram, krishna);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleInterpretation();
		System.out.println("Ram is male ?"+isMale.express("Ram"));
		System.out.println("Is Sita a male ?"+isMale.express("Sita"));
	}

}
