package com.iu.t2;

public class Eat implements Runnable{
	
	@Override
	public void run() {
		this.lunch();
		
	}
	
	public synchronized void lunch() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("yamiyami");
		}
	}
}
