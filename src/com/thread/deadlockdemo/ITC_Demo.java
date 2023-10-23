package com.thread.deadlockdemo;

public class ITC_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SharedR res = new SharedR();

		Thread t1 = new Thread() {
			public void run() {
				res.method1();

			}
		};

		Thread t2 = new Thread() {
			public void run() {
				res.mathod2();
			}
		};
		t1.start();
		t2.start();

	}

}
