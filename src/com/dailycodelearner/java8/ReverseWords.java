package com.dailycodelearner.java8;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcom To Java";
		String[] split = str.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
		}
	}

}
