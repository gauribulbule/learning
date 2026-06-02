package com;

import java.io.FileNotFoundException;

public class ThrowsExamples {

	static void dis1() throws FileNotFoundException,ArithmeticException{
		//try {
		int result = 100/0;
		//}catch(ArithmeticException e) {}
		System.out.println("dis1 method");
	}
	static void dis2() {
		try {
		dis1();
		}catch(Exception e) {}
		System.out.println("dis2 method");
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//try {
		dis2();
		//}catch(Exception e) {}
		System.out.println("main method");
	}

}
