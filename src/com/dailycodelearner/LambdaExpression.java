package com.dailycodelearner;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MyFunctionalInterface mif=(a)->System.out.println(a);
		mif.printMsg("hello world");
	}

}
