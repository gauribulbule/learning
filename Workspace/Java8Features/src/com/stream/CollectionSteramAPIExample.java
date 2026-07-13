package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//class MyConsumer implements Consumer<String>{
//	@Override
//	public void accept(String t) {
//	System.out.println("name  is "+t);
//		
//	}
//}
public class CollectionSteramAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> names = new ArrayList<String>();
//		names.add("Raj"); names.add("Raju"); names.add("Ajay"); names.add("Vikash");
////			System.out.println("display names in string format");
////			System.out.println(names);
////		System.out.println("dispaly names using for each loop");
////		for(String name:names) {
////			System.out.println(name);
////		}
////		System.out.println("display names using forEach method part of java 8 without lambda");
////		Consumer<String> cc = new MyConsumer();
////		names.forEach(cc);
////		System.out.println("display names using forEach method parr of java 8 using lambda");
////		names.forEach(name->System.out.println("name is "+name));	// forEach is a type of terminal operator 
//		
//		
////		names.stream().forEach(name->System.out.println("name "+name));// stream without intermediate operator with only terminal operator 
////		System.out.println("---");
////		names.stream().filter(name->name.length()>5).forEach(name->System.out.println("name "+name));
////		System.out.println("---");
////			names.stream().map(name->name.toUpperCase()).forEach(name->System.out.println("name "+name));
////		System.out.println("---");
////		names.stream().map(name->name.toLowerCase()).filter(v->v.length()>5).forEach(name->System.out.println("name "+name));
//		
//	List<String> newNames= 	names.stream().filter(name->name.startsWith("R")).collect(Collectors.toList());
//	System.out.println(newNames.size());
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
	 	int sum= list.stream().reduce(100, (a,b)->{int sum1 = a+b;
	 	System.out.println(sum1+" "+a+" "+b);
	 	return sum1;});
	 	System.out.println(sum);
	}

}
