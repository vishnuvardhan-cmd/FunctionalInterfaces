package com.dailycodelearner.consumer;

import java.util.function.Consumer;
public class ConsumerInterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> c=(s)->System.out.println(s);
		c.accept("family");

	}

}
