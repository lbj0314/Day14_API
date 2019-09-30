package com.iu.t2;

public class Tv implements Runnable{
	
	@Override
	public void run() {
		this.watch();
	}
	
	public void watch() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("tv watching");
		}
	}
}
