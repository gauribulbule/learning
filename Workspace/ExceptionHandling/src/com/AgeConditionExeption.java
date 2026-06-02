package com;

public class AgeConditionExeption extends Exception{

	public AgeConditionExeption() {
		// TODO Auto-generated constructor stub
		super();
	}
	public AgeConditionExeption(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);  // passing msg to super class constructor to set the message. 
	}
}
