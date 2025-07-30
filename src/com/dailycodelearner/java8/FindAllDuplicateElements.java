package com.dailycodelearner.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "avasdvacadavasvada";
		// for removing all dulipcates
		Set<String> collect = Arrays.stream(input.split("")).collect(Collectors.toSet());
		System.out.println(collect);

		// for finding duplicates
		Map<String, List<String>> collect1 = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity()));
		System.out.println(collect1);
		Map<String, Long> collect2 = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Set<String> keySet = collect2.keySet();
		List<String> duplicateElements = collect2.entrySet().stream().filter(x -> x.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicateElements);

		// Find first non repeating element
		String findFirst = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();

		System.out.println(findFirst);
		// Find first repeating element
		String findFirstRepeatingCharacter = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1).findFirst().get().getKey();
		System.out.println(findFirstRepeatingCharacter + " findFirstRepeatingCharacter");
	}

	
	
}
