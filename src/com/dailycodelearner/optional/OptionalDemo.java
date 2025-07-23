package com.dailycodelearner.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="coolie";
		Optional<String> op=Optional.empty();
		System.out.println(op);
		
		Optional<String> op1=Optional.of(test);
		System.out.println(op1);
		
		Optional<String> op2=Optional.ofNullable(test);
		System.out.println(op2);
		
		Optional<String> op3=Optional.ofNullable(test);
		System.out.println(op3.get());
		
		Optional<String> op4=Optional.ofNullable("ramp");
		System.out.println(op4.orElse("no value"));


	}

}
