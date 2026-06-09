package com;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			
			try {
				int result = 100/1;
				int res[] = {1,2,3,4};
				int result1 = res[7];
			}catch(ArithmeticException e) {
				System.out.println("Inner catch "+e);
			}finally{
				System.out.println("finally block");
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("outer catch "+e);
		}finally {
			System.out.println("fianlly block of outer");
		}
		System.out.println("finished");
	}

}
