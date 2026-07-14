package com.virtual;

public class VirtualThreadExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

			Thread t = Thread.startVirtualThread(()-> {
				System.out.println(Thread.currentThread());
				Thread t1 = Thread.currentThread();
				t1.setPriority(1);
				System.out.println(t1.getPriority());
			});
			t.join();
			System.out.println("done main thread");
	}

}
