package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HI");
		int a=10;
		int b=1;
		int abc[]= {1,2,3,4};
		try {
		Connection con =  DriverManager.getConnection("","","");
		FileInputStream fis = new FileInputStream("abc.txt");
		int result = a/b;	// new ArithmeticException();
		System.out.println("Result "+result);
		int result1 = abc[8];
		System.out.println("Result is "+result1);
		String str = null;
		System.out.println(str.length());
		}catch(FileNotFoundException | SQLException e) {	// java 7 onwards 
			//System.out.println("I Take Care!");
			//System.out.println(e.getMessage());
			System.out.println("Divided by zero or Array Index  "+e.toString());
			//e.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array index "+e);
		}
//		catch(SQLException e) {
//			System.out.println(e.toString());
//		}
		catch(Exception e) {
			System.out.println("Generic "+e.toString());
		
		}
		System.out.println("bye...");
		System.out.println("bye...");
		System.out.println("bye...");
	}

}
