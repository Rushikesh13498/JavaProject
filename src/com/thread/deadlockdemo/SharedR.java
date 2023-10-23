package com.thread.deadlockdemo;

public class SharedR {

	public synchronized void method1() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + " task started");
		System.out.println(tname + " has locked method 1");
		System.out.println(tname + " has released method 1");

		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tname+" has finished the task");
	}

	public synchronized void mathod2() {
		String tname=Thread.currentThread().getName();
		
		System.out.println("Method 2 is started");
		notify();
		System.out.println(tname+" has notified");
	}

	
}
