package com.thread;


class Myt implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running...."+Thread.currentThread().getName());
		
	}
	
}

public class Threadcreationtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myt t=new Myt();
		
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		Thread t5=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
