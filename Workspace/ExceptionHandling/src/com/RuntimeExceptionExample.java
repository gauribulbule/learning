package com;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HI");
		int a=10;
		int b=1;
		int abc[]= {1,2,3,4};
		try {
		int result = a/b;	// new ArithmeticException();
		System.out.println("Result "+result);
		int result1 = abc[1];
		System.out.println("Result is "+result1);
		String str = "abc";
		System.out.println(str.length());
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
			//e.printStackTrace();
		}
		System.out.println("bye...");
		System.out.println("bye...");
		System.out.println("bye...");
	}

}
