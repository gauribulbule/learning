package com.comparable;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
	System.out.println(this.id+" "+o.id);
		return this.id-o.id;		// +ve, 0 or -ve // asc order id 
		//return o.id- this.id;		// desc order by id 
		//return (int)(this.salary-o.salary);
		//return (int)(o.salary-this.salary);
		//return this.name.compareTo(o.name); // asc by name
	//return o.name.compareTo(this.name); // asc by name
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
