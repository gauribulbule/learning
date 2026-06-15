package com.synchronizationexample;

class BookingApp implements Runnable {
	int avl = 2;
	@Override
	public  void run() {
	String name  = Thread.currentThread().getName();
	System.out.println(name+" ready to book");
	
	synchronized (this) {
		
		if(avl>0) {
			System.out.println(name+" got the ticket");
			avl = avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
	}
	
	System.out.println(name+" done booking");
	}
}
public class DemoTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookingApp ba1 = new BookingApp();	// heap avl = 2
		//BookingApp ba2 = new BookingApp();	// heap avl = 2
		//BookingApp ba3 = new BookingApp();	// heap avl = 2
		//BookingApp ba4 = new BookingApp();	// heap avl = 2
		Thread t1 = new Thread(ba1,"Raj");
		Thread t2 = new Thread(ba1,"Ravi");
		Thread t3 = new Thread(ba1,"Ram");
		Thread t4 = new Thread(ba1,"Raju");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
