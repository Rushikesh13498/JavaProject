package com.multithreading;


class Mythread extends Thread{
	public void run() {
		System.out.println("thread is running-->"+Thread.currentThread().getName());
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mythread t1=new Mythread();
		t1.run();
		t1.setName("IT");
		t1.start();
		
		Mythread t2=new Mythread();
		t2.run();
		t2.setName("COMP");
		t2.start();
		
		
		
	}

}
