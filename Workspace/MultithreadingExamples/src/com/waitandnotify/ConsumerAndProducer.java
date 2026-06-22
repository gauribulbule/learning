package com.waitandnotify;

class SharedData {
	int data;
	boolean available=false;
	public synchronized void put(int data) throws Exception {
		while(available) {
			wait();
		}
		this.data = data;
		available = true;
		System.out.println("Produced the data "+data);
		notify();
	}
	
	public synchronized int get() throws Exception {
		while(!available) {
			wait();
		}
		int value = data;
		available = false;
		notify();
		return value;
	}
}

class Consumer implements Runnable{
	SharedData sd;
	public Consumer(SharedData sd) {
		// TODO Auto-generated constructor stub
		this.sd = sd;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<=5;i++) {
				int data = sd.get();
				System.out.println("Consumed data is "+data);
				Thread.sleep(500);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class Producer implements Runnable{
	SharedData sd;
	public Producer(SharedData sd) {
		// TODO Auto-generated constructor stub
		this.sd = sd;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<=5;i++) {
				sd.put(i);
				Thread.sleep(500);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class ConsumerAndProducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedData sd = new SharedData();
		Producer pd = new Producer(sd);
		Consumer cs = new Consumer(sd);
		Thread t1 = new Thread(pd);
		Thread t2 = new Thread(cs);
		t1.start();
		t2.start();
	}

}
