package com.extendthread;
class MyThread1 extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		MyThread1 obj1  = new MyThread1();
		MyThread2 obj2 = new MyThread2();	// instance of thread. 
		obj1.setPriority(10);
		obj2.setPriority(1);
		obj1.start();
		obj2.start();     // thread is ready to run : Runnable state. 
	}

}
