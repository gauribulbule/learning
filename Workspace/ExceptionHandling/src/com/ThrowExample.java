package com;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		try {
		if(age<21) {
			//throw new Exception();	// generic exception with custom condition 
			//throw new Exception("age must be > 21"); // pre defined generic exception but custom message 
			//throw new ArithmeticException("age must be >21");
			//throw new AgeConditionExeption();	// custom or user defined exception 
			throw new AgeConditionExeption("age must be >21");	// custom or user defined exception with custom message 
		}else {
			System.out.println("You can apply for Job");
		}
		}catch(AgeConditionExeption e) {
			System.out.println(e);
		}catch(Exception e) {
			
		}
	}

}
