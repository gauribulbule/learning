package com;
@FunctionalInterface
interface Hello {
	void dis1();
	default void dis2() {
		
	}
}


interface Abc {
	void dis1();
	void dis2();
	default void dis3() {
		
	}
	default void dis4() {
		
	}
	static void dis5() {
		
	}
	static void dis6() {
		
	}
	static void dis7() {
		
	}
}
class Xyz implements Abc {
	@Override
	public void dis1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dis2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dis3() {
		
	}
//	@Override
//	public void dis5() {
//		
//	}
}
public class Java8InterfaceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
