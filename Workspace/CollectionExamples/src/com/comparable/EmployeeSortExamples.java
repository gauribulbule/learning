package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(2, "Raj", 44000));
		listOfEmp.add(new Employee(3, "Ajay", 34000));
		listOfEmp.add(new Employee(1, "Vikash", 24000));
		System.out.println("Before sort");
		for(Employee emp : listOfEmp) {
			System.out.println(emp);
		}
		Collections.sort(listOfEmp);
		System.out.println("Before sort");
		for(Employee emp : listOfEmp) {
			System.out.println(emp);
		}
	}

}
