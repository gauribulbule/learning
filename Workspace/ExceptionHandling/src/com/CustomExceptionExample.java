package com;

import com.myexception.AmountWithdrawnException;
import com.myexception.ApplicationException;

public class CustomExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float amount = 700;
		if(amount<500) {
			//throw new ApplicationException("amount must be >=500");
			throw new AmountWithdrawnException("amount must be >=500");
		}else {
			System.out.println("Amount withdrawn successfully");
		}
		
	}

}
