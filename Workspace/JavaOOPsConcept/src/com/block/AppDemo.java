package com.block;
class Parent {
	static {
		System.out.println("Parent static block");
	}
	{
		System.out.println("Parent init block");
	}
	public Parent() {
		System.out.println("Parent class constructor");
	}
	void parentMethod() {
		System.out.println("Parent method");
	}
}
class Child extends Parent {
	static {
		System.out.println("Child static block");
	}
	{
		System.out.println("Child init block");
	}
	Child() {
		super();
		System.out.println("Child class constructor");
	}
	void childMethod() {
		System.out.println("Child method");
	}
	static void childStaticMethod() {
		System.out.println("child static method");
	}
}
public class AppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent pp = new Parent();
		//Child child1 = new Child();
		//Child child2 = new Child();
//		child1.childMethod();
//		child1.childMethod();
		Child.childStaticMethod();
		Child.childStaticMethod();
	}	

}
