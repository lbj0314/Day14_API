package com.iu.t2;

public class Main {
	public static void main(String[] args) {
		Eat eat = new Eat();
		Tv tv = new Tv();
		
		Thread t1 = new Thread(eat);
		Thread t2 = new Thread(tv);
		
		t1.start();
		t2.start();
	}
	
}
