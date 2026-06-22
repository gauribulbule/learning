package com.concurrencyexamples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Callable<Thread>{
	@Override
	public Thread call() throws Exception {
	Thread t = Thread.currentThread();
//	for(int i=0;i<5;i++) {
//		System.out.println("in call method "+t);
//	}
		return t;
	}
}
public class ExecutorServiceExamples {

	
	//ThreadPoolExecutor tpe = new Thread
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Task tt = new Task();
		//ExecutorService es = Executors.newSingleThreadExecutor();
		ExecutorService es = Executors.newFixedThreadPool(5);	// 3 thread 
		//ExecutorService es = Executors.newCachedThreadPool();
		for(int i=0;i<3;i++) {
			Future<Thread> ff =  es.submit(tt);
			System.out.println(ff.get());
		}
		
		es.shutdown();
	}

}
