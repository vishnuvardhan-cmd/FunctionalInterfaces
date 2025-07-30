package com.dailycodelearner.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OccurenceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  input="abaccabadca";
		//For getting the each characters exsist how many times
		Map<String, List<String>> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(s->s));
		System.out.println(collect);
		//for getting count for each character
		Map<String, Long> collect2 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect2);
		
		
	
		
		}

}
