package com.implementrunnable;
class MyThread1 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}
class MyThread2 implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
		}
	}
}
public class DemoTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1 = new MyThread1();
		Runnable obj2 = new MyThread2();
		Thread t1 = new Thread(obj1); 
		Thread t2 = new Thread(obj2); // it take runnable interface reference as parameter. 
		t1.start();
		t2.start();
	}

}
