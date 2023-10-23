package com.thread;

class Threadjoin extends Thread {
	
	public void run() {
	System.out.println("---------------start-----------");
		for (int i = 0; i < 5; i++) {
			System.out.println("i =" + i + " " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		System.out.println("---------------end----------------");
	}
}

public class Joindemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------start-----------");
		for (int i = 0; i < 5; i++) {
			System.out.println("i =" + i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("-----------end---------------");

		Thread t1 = new Thread();
		t1.start();
		try {
			t1.join(3000);
		}catch(InterruptedException e){
		   e.printStackTrace();
		}
		
		
		
		System.out.println("----------------------");
		Threadjoin t2 = new Threadjoin();
		t2.start();
		
	}

}
