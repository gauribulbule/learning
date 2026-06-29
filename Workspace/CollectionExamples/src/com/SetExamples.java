package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> ss = new HashSet<Integer>();
		ss.add(3);
		ss.add(1);
		ss.add(6);
		ss.add(3);
		System.out.println(ss);
		Iterator<Integer> li = ss.iterator();
		while(li.hasNext()) {
			int i = li.next();
			System.out.println(i);
			li.remove();
			//ss.remove(i);
//			if(i>5) {
//				li.remove();
//				//ss.remove(6);
//			}
		}
		System.out.println(ss);
	}

}
