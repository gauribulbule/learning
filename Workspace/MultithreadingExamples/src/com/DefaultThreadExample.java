package com;

public class DefaultThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name1 = t.getName();
		System.out.println(name1);
		System.out.println(t); // name of the thread : main, priority 5, and group of thread main 
		t.setName("My Thread");
		t.setPriority(10);// 1 to 10
		System.out.println(t);
		ThreadGroup tg = t.getThreadGroup();
		System.out.println(tg);
		int priority = t.getPriority();
		String name = t.getName();
		System.out.println(priority+" "+name);
	}

}
