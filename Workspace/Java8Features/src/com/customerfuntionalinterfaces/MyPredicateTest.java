package com.customerfuntionalinterfaces;

import java.util.function.Predicate;

class MyPredicate implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t>18;
	}
}

public class MyPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = new MyPredicate();
		System.out.println(p1.test(10));
		
		Predicate<Integer> p2 = (num)->num>18;
		boolean result = p2.test(20);
		
		Predicate<String> p3 = (name)->name.length()>5;
		System.out.println(p3.test("Raj"));
	}

}
