package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee {
	int id;
	String name;
	float salary;
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class GroupingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "Raj", 12000));
		listOfEmp.add(new Employee(2, "Ravi", 10000));
		listOfEmp.add(new Employee(3, "Ramesh", 12000));
		listOfEmp.add(new Employee(4, "Rajesh", 15000));
		
		List<Employee> newEmployees   = listOfEmp.stream().collect(Collectors.toList());
//		Map<Float, List<Employee>> groupData= listOfEmp.stream().collect(Collectors.groupingBy(e->e.salary));
//		System.out.println(groupData);
		
		//Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(e->System.out.println(e));
//		int abc[]= {1,2,3,4,5,6,7,8,9,10};
//		IntStream.of(abc).forEach(e->System.out.println(e));
//		String names[]= {"A","B"};
//		Stream.of(names);
		List<Integer> number = new ArrayList<Integer>();
		number.add(1);number.add(4);number.add(9);number.add(10);number.add(16);number.add(90);number.add(100);
		number.stream().forEach(e->System.out.println(e));
		System.out.println();
		//number.parallelStream().forEach(e->System.out.println(e));
		//Set<Integer> ss =  number.parallelStream().collect(Collectors.toSet());
		//System.out.println(ss);
		//number.stream().filter(null).map(null).col
//		List<Integer> ll1 =  number.parallelStream().collect(Collectors.toList());
//		System.out.println(ll1);
	}

}
