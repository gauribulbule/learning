package com;

import java.io.Serializable;

public class Employee implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 2L;	// only one copy ie static 
private int id;
private String name;
private transient float salary;		// many copies equal to number of object but not stored in file
private String desgs;

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", desgs=" + desgs + "]";
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	super();
	System.out.println("object created");
	// TODO Auto-generated constructor stub
}
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
