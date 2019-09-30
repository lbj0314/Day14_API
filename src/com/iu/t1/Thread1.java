package com.iu.t1;

public class Thread1 extends Thread{

	@Override
	public void run() {
		this.test1();

	}

	public void test1() {

		for(int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("test1 : "+i);

		}
	}
}
