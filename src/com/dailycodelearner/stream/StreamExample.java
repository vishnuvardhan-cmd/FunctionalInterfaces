package com.dailycodelearner.stream;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> str=Stream.of("a","b","c");
		str.forEach( s->System.out.println(s));
	}

}
