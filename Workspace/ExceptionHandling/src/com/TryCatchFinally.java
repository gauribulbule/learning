package com;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		try {
			int result = 100/0;
			System.out.println(result);
			System.out.println("No exception");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("normal statement");
	}

}
