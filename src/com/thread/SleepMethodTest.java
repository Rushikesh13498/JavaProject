package com.thread;

class MyThread extends Thread {

	public void run() {

		int i;
		System.out.println("------------thread job start-------------");
		for (i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(2000, 2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("------------Thread job ends---------------");

	}
}

public class SleepMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
	t1.run();
	t2.run();
	
	}

}
