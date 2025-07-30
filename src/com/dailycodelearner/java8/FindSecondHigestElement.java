package com.dailycodelearner.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondHigestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find second highest element  
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4));
		
		List<Integer> ascList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(ascList+ " Ascending List");
		
		//approach 1
		int[] list1= {1,23,42,52,321,31,32,42};
		
		List<Integer>  desclist= Arrays.stream(list1).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		int findSecondHighestElement=desclist.get(1);
		System.out.println(findSecondHighestElement+ " findSecondHighestElement");
		
		//approach 2
		Integer first = Arrays.stream(list1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	
		System.out.println(first);
		
		
	}

}
