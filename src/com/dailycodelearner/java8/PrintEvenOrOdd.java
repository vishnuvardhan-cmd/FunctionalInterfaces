package com.dailycodelearner.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>(Arrays.asList(1,24,4,53,2));
		list.add(542);
		
		List<Integer> evenList = list.stream().filter(s->s%2==0).collect(Collectors.toList());
		
		List<Integer> oddList = list.stream().filter(s->s%2!=0).collect(Collectors.toList());
		
		System.out.println(evenList);
		
		System.out.println(oddList);

	}

}
