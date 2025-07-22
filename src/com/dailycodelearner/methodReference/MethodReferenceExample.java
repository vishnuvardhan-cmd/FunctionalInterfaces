package com.dailycodelearner.methodReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;


public class MethodReferenceExample {

	public static int addition(int a,int b) {
		return a+b;
	}
	
	public void printMsg(String msg) {
		
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method reference to static method
		
		Function<Integer,Double> sqr=Math::sqrt;
		
		
		System.out.println(sqr.apply(2));
		
		BiFunction<Integer, Integer, Integer> bf=MethodReferenceExample::addition;
		System.out.println(bf.apply(19, 32));
		
		
		//method reference to instance method of an object
		
		
		MethodReferenceExample mr=new MethodReferenceExample();
		Consumer<String> con=mr::printMsg;
		
		con.accept("hello world");
		
		//Method reference to an instance method of an arbitary object of specific type
		
		Function<String,String> arbitaryRefer=String::toUpperCase;
		
		System.out.println(arbitaryRefer.apply("coolie"));
		
		// Reference To constructor
		
		List<String> list=new ArrayList<>();
		list.add("banana");
		list.add("apple");
		list.add("mango");
		list.add("watermelon");
		
		Function<List<String>,Set<String>> data=(list2)->new HashSet<>(list2);
		System.out.println(data.apply(list)+" data");
		
		Function<List<String>,Set<String>> data1=HashSet::new;
		
		System.out.println(data.apply(list)+" data1");
	}

}
