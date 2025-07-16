package com.dailycodelearner.functional;

import java.util.function.Function;

public class FunctionalInterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer> f=(s)->s.length();
		System.out.println(f.apply("vishnu"));
	}

}
		