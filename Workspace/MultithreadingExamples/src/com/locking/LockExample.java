package com.locking;

import java.util.concurrent.locks.ReentrantLock;

class Task implements Runnable {
	
	ReentrantLock lock1 = new ReentrantLock();
	ReentrantLock lock2 = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		//synchronized (this) {
			
		lock1.lock();
		 {
		try {
			
			for(int i=1;i<=5;i++) {
				System.out.println(name+" "+i);
				Thread.sleep(500);
			}
		
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			lock1.unlock();
			
		}
		
		}
		//}
	}
}
public class LockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task tt = new Task();
		Thread thread1 = new Thread(tt,"1st Thread");
		Thread thread2 = new Thread(tt,"2nd Thread");
		thread1.start();
		thread2.start();
	}

}
