package com;

public class ExceptionProgationExample {

	static void methodA() {
		try {
			int result = 100/0;
		}catch (Exception e) {
			System.out.println("method A "+e);
			throw new NullPointerException("null poiner exception generated");
		}
	}
	static void methodB() {
		methodA();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodB();
	}

}
