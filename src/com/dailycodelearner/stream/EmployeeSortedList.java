package com.dailycodelearner.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(10, "shanmukh", 23, 8792742L));
		employee.add(new Employee(20, "gayatri", 12, 322324L));
		employee.add(new Employee(30, "vidya", 89, 234849842L));
		employee.add(new Employee(40, "pratysha", 34, 424242L));

		System.out.println(sortBySalaryAscending(employee));
		
		System.out.println(sortBySalaryAscendingUsingCompartor(employee));
		
		System.out.println(sortBySalaryDescendingUsingCompartor(employee));
	}

	public static List<Employee> sortBySalaryAscending(List<Employee> emp) {

		return emp.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
	}

	public static List<Employee> sortBySalaryAscendingUsingCompartor(List<Employee> emp) {

		return emp.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
	}
	
	public static List<Employee> sortBySalaryDescendingUsingCompartor(List<Employee> emp) {

		return emp.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
	}
}
