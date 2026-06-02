package com;

public class TryWithFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Hi");
				try {
					int result = 100/1;
					System.out.println(result);
					System.out.println("No exception");
					//System.exit(0);
				} finally {
					System.out.println("finally block");
				}
				System.out.println("normal statement");
	}

}
