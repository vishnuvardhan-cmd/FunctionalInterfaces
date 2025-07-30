package com.dailycodelearner.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str=Arrays.asList("1","2","3","5","2");
	
		String str1=String.join(")",str);
		System.out.println(str1);
		
		
	}

}
