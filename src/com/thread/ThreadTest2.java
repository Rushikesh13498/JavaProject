package com.thread;

public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread1
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("i = " + i + " " + Thread.currentThread().getName());
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		};

		// thread 2
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 11; i < 16; i++) {
					System.out.println("i = " + i + " " + Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.run();
		t2.run();
		System.out.println("--------------------------");
		t1.start();
		t2.start();

	}

}
