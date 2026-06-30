package com.concurrentexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> data = new ArrayList<String>();
		//List<String> data = new CopyOnWriteArrayList<String>();
		//Set<String> data = new HashSet<String>();
		//Set<String> data = new CopyOnWriteArraySet<String>();
		Set<String> data  = new ConcurrentSkipListSet<String>();
		data.add("Raj");
		data.add("Mahesh");
		for(String dd : data) {
			data.add("Vikash");
			System.out.println(dd);
		}
		System.out.println("size is "+data.size());
		System.out.println(data);
	}

}
