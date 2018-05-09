package com.bjsxt.base.sync001;

public class MyThreadDemo extends Thread {
	
	private int count = 5;
	
	public static void main(String[] args) {
		MyThreadDemo mtd = new MyThreadDemo();
		Thread t1 = new Thread(mtd, "t1");
		Thread t2 = new Thread(mtd, "t2");
		Thread t3 = new Thread(mtd, "t3");
		Thread t4 = new Thread(mtd, "t4");
		Thread t5 = new Thread(mtd, "t5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	}
	
	@Override
	public void run() {
		count--;
		System.out.println(count);
	}

}
