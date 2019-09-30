package com.iu.t1;

public class Thread2 extends Thread {

	@Override
	public void run() {
		this.test2();
	}

	public void test2() {

		for(int i = 0; i < 10; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("test2 : "+i);

		}
	}	
}
