package com.dailycodelearner.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FindNthHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First approach
		int[] salary = { 12, 3, 32, 324242, 424432, 242, 23254, 34242 };

		List<Integer> collect = Arrays.stream(salary).boxed().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		Integer integer = collect.get(2);
		System.out.println(integer);
		
		Map<String,Integer> users=new HashMap<>();
		users.put("raghu", 32422);
		users.put("kishore",72947);
		users.put("raju",478344);
		users.put("ravi",2732);
		users.put("rahul",32324);
		users.put("ramya",42424);
		users.put("sandeep",3242);
		users.put("sanjay",2937982);
		
		Entry<String, Integer> entry = users.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.collect(Collectors.toList()).get(3);
		
		
		System.out.println(entry);
		
	}

}
