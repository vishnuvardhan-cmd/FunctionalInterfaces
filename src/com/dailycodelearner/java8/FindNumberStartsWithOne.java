package com.dailycodelearner.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumberStartsWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find Number Starts With One
		List<Integer> asList = Arrays.asList(1, 2, 34, 2, 3, 51, 11, 31, 12, 13, 14, 1);

		List<Integer> collect = asList.stream().filter(x -> x.toString().startsWith("1")).collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
