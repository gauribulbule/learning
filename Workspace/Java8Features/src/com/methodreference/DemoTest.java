package com.methodreference;

import java.util.ArrayList;
import java.util.List;

interface Hello {
	public void sayHello(String name);
}
class HelloImp {
	public static void sayHi(String name) {
		System.out.println("Name using method reference static "+name);
	}
}
class HelloImp1 {
	public void say(String name) {
		System.out.println("Name using method reference non static "+name);
	}
}
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// body for sayHello method using lambda 
		
		Hello h1 = name->System.out.println("name is "+name);
		h1.sayHello("Raj");
		
		Hello h2 = name->System.out.println(name);
		h2.sayHello("Raj");
		
		Hello h3 = name->System.out.println("Mr "+name);
		h3.sayHello("Raj");
		
		Hello h4 = name->HelloImp.sayHi(name);		// existing method logic with lambda 
		h4.sayHello("Raj");
		
		Hello h5 = HelloImp::sayHi;			// here we can use existing method logic 
		h5.sayHello("Ravi");
		
		HelloImp1 obj = new HelloImp1();
		Hello h6 = obj::say;
		h6.sayHello("Raju");
		
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(1);ll.add(2);ll.add(3);ll.add(4);
		ll.stream().forEach(e->System.out.println("Value is "+e));
		System.out.println();
		ll.stream().forEach(System.out::println);
	}

}
