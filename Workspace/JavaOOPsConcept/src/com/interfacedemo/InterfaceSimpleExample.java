package com.interfacedemo;
/*class A {
			void dis() : A class method logic 
}
class B {
		void dis()	: B class  method logic
}
class C extends A,B {
	
}*/
interface A {
	public static final int A1=10;
	//int B;
	void dis1();
	public abstract void dis2();
	void display();
}
interface B {
	int B1=30;
	void dis3();
	void display();
}
interface C extends A,B{		// we can achieve multiple inheritance using interface. 
	int C1 = 40;
	void dis4();
}
class Test implements A,B {

	@Override
	public void dis3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dis1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dis2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}		// we can achieve multiple inheritance using class with interface 
	
}
public class InterfaceSimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
