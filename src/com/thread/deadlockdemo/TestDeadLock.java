package com.thread.deadlockdemo;

class MyThread1 extends Thread {

	Shared s1, s2;// r1,r2

	public MyThread1(Shared s1, Shared s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		s1.javaTest(s2);
	}

}

class MyThread2 extends Thread {

	Shared s1, s2;

	public MyThread2(Shared s1, Shared s2) {
		super();
		this.s1 = s1;// r1
		this.s2 = s2;// r2
	}

	public void run() {
		s2.javaTest(s1);
	}

}

public class TestDeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared s1 = new Shared();
		Shared s2 = new Shared();

		MyThread1 t1 = new MyThread1(s1, s2);
		MyThread2 t2 = new MyThread2(s1, s2);

		t1.start();
		t2.start();

	}

}
