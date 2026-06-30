package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				List<Employee> listOfEmp = new ArrayList<Employee>();
				listOfEmp.add(new Employee(2, "Raj", 44000));
				listOfEmp.add(new Employee(3, "Ajay", 34000));
				listOfEmp.add(new Employee(1, "Vikash", 24000));
				System.out.println("Before sort");
				for(Employee emp : listOfEmp) {
					System.out.println(emp);
				}
				//Collections.sort(listOfEmp, new EmployeeSortbyIdAsc());
				Collections.sort(listOfEmp, (e1,e2)->e2.getId()-e1.getId());
				System.out.println("Before sort");
				for(Employee emp : listOfEmp) {
					System.out.println(emp);
				}
	}

}
