package com.dailycodelearner.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstLongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abcdabcdea";
		System.out.println(LongestSubString(str)+"hello");
	}	
	
	private static String LongestSubString(String str) {
		// TODO Auto-generated method stub
		HashSet<Character> c = new HashSet<>();
		String longestoverall="";
		String longest="";
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(c.contains(ch)) {
				longest="";
				c.clear();
			}
			longest+=ch;
			c.add(ch);
			if(longest.length()>longestoverall.length()) {
				longestoverall=longest;
			}
		}
		
//		for(int i=0;i<str.length();i++) {
//			char a=str.charAt(i);
//			if(!longest.contains(a+"")) {
//				longest=longest.concat(a+"");
//				System.out.println(longest);
//			}
//			else {
//				set.add(longest);
//				longest="";
//				longest=longest.concat(a+"");
//			}
//		}
//		
//		System.out.println(set);
		return longestoverall;
	}

}
