package com.automaticconcpet;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    int count = 0;

    public void increment() {
    	Thread t =Thread.currentThread();
		System.out.println(t);
        count++; // thread-safe
    }
	
//	AtomicInteger count = new AtomicInteger(0);
//	
//	public void increment() {
//		Thread t =Thread.currentThread();
//		System.out.println(t);
//		count.incrementAndGet();
//	}
}


public class DemoTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	    Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = " + counter.count);

	}

}
