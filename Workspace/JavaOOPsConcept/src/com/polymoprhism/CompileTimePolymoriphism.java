package com.polymoprhism;

class Operation {
	
	void add() {
		System.out.println(10+20);
	}
	void add(int x) {
		System.out.println(x+20);
	}
	void add(int x,int y) {
		System.out.println(x+y);
	}
	void add(float x, float y) {
		System.out.println(x+20);
	}
	void add(String s1,String s2) {
		System.out.println(s1+s2);
	}
}
public class CompileTimePolymoriphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new Operation();
		op.add();
		op.add("1","2");
		op.add(1,2);
		op.add(10.0f,20.0f);
	}

}
