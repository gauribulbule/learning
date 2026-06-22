package com.volatileexample;

class FlagTask extends Thread {

    volatile boolean running = true;
    int i=0;
    public void run() {
        while (running) {
            // infinite loop
        	//System.out.println("running...");
        	i++;
        }
        System.out.println("Thread stopped after value of i is "+i);
    }
}


public class DemoTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	       FlagTask t = new FlagTask();
	        t.start();

	        Thread.sleep(1000);
	        t.running = false;   // may not be visible

	}

}
