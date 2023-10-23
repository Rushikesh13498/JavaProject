package com.thread;

class T extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}
}

public class PriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		T t1 = new T();
		T t2 = new T();
		T t3 = new T();

		System.out.println("t1 priority:" + t1.getPriority());
		System.out.println("t2 priority:" + t2.getPriority());
		System.out.println("t3 priority:" + t3.getPriority());

		t1.setPriority(2);
		t2.setPriority(10);
		t3.setPriority(5);
		
		System.out.println("t1 priority:" + t1.getPriority());
		System.out.println("t2 priority:" + t2.getPriority());
		System.out.println("t3 priority:" + t3.getPriority());
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
