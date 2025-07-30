package com.dailycodelearner.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindLongestStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find Longest String In Array
		String[] strArr = { "jav:", "hello", "learning", "keyconcepts" };
		String longString = Arrays.stream(strArr).reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get(); 

	}

}
