package com.utiltiies;
import java.util.*;
public class CollectionsDemoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String names[]= {"Raj","Ajay","Vikash","Mahesh","Lokesh"};
		// converting array names into list of names. 
		//List<String> listOfNames = List.of(names);
		//System.out.println(names);
		List<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Raj");
		listOfNames.add("Ajay");
		listOfNames.add("Balaji");
		listOfNames.add("Mahesh");
		listOfNames.add("Vikash");
		System.out.println(listOfNames);
			Collections.sort(listOfNames);
		System.out.println(listOfNames);
			Collections.reverse(listOfNames);
		System.out.println(listOfNames);
	}

}
