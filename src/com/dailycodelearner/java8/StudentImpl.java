package com.dailycodelearner.java8;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	
	private int id;
	private String name;
	private int rank;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String name, int rank, String city) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", city=" + city + "]";
	}
	
	
}

public class StudentImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList=Stream.of(
				new Student(1,"vishnu",34,"kavali"),
				new Student(2,"ravi",13,"kurnool"),
				new Student(3,"charan",1,"kadapa"),
				new Student(4,"rahul",22,"kadiri"),
				new Student(5,"sudeer",28,"chennai"),
				new Student(6,"manideep",98,"kurnool"),
				new Student(7,"sravan",87,"guntur"),
				new Student(8,"kalyan",34,"gowravaram"),
				new Student(9,"ramesh",13,"kondapuram"),
				new Student(10,"mounika",1,"kaligir"),
				new Student(11,"charsima",22,"kadiri"),
				new Student(12,"palavi",28,"tirupati"),
				new Student(13,"manideep",98,"kurnool"),
				new Student(14,"sravan",87,"guntur")
				).collect(Collectors.toList());
		
		List<Student> ranklist = studentList.stream().filter(s->s.getRank()>50 && s.getRank()<100).collect(Collectors.toList());
		System.out.println(ranklist.toString());
		
		
		List<Student> sortednamelist = studentList.stream().filter(s->s.getCity()=="kurnool").sorted(Comparator.comparing(Student::getName,Comparator.reverseOrder()))
				.distinct().collect(Collectors.toList());
		
		System.out.println(sortednamelist.toString());
		
		Set newSet=new HashSet<>(sortednamelist);
		
		System.out.println(newSet);
		
		Map<String, List<Student>> groupByName = studentList.stream().collect(Collectors.groupingBy(Student::getName));
		
		System.out.println(groupByName);
		
Map<String, Long> groupByNameAndCount = studentList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));
		
		System.out.println(groupByNameAndCount);
		
		Entry<String, Long> entry = studentList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println(entry);
		
		}

}
