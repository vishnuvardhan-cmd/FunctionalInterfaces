package com.dailycodelearner.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedStringStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ascending order sorting

		List<Integer> intList= new ArrayList(Arrays.asList(1,4,2,42,52,52,52,2));
		//normal way
		intList.stream().sorted().forEach(System.out::print);
		
		System.out.println("***********");
		
		//using natural order above one and this are same
		intList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::print);
		System.out.println("***********");
		//using traditional approach
		intList.stream().sorted((o1,o2)->o1.compareTo(o2)).forEach(System.out::print);
		System.out.println("***********");
		//descinding order sorting
		intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println("***********");
		//descinding using tradintional approach
		intList.stream().sorted((o1,o2)->o2.compareTo(o1)).forEach(System.out::print);
		System.out.println("***********");
	}

}
