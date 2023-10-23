package com.thread;
//case 1
public class ThreadInterruptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 11; i < 16; i++) {
					System.out.println("i = " + i + " " + Thread.currentThread().getName());
					if(Thread.interrupted()) {
						System.out.println("TRUE");
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					 System.out.println("Thread entered in interrupted stage");
					}
				}
			}
		};
		
		t2.start();
		t2.interrupt();
	}

}
