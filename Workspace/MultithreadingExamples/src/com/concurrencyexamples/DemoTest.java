package com.concurrencyexamples;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread created using thread class");
	}
}
class MyThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread created using runnable interface");
	}
} 
class MyThread3 implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Thread created using callable interface");
		return "Thread created using call method ";
	}
}
public class DemoTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		MyThread1 obj1 = new MyThread1();
//		obj1.start();
//		
//		MyThread2 obj2 = new MyThread2();
//		Thread t1 = new Thread(obj2);
//		t1.start();
//		System.out.println("without executor service");
		
//		MyThread2 obj3 =new MyThread2();
//		Executor exe = Executors.newSingleThreadExecutor();
//		exe.execute(obj3);		// only runnable . no return type 
		
		MyThread2 obj4  = new MyThread2();
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.submit(obj4);	// submit method return type is Future 
		
		MyThread3 obj5 = new MyThread3();
		Future<String> result =  es.submit(obj5);
		System.out.println(result.get());
		
	}

}
