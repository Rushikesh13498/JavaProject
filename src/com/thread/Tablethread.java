package com.thread;

public class Tablethread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------------table of 5--------------");
		for(int i=1;i<=10;i++) {
			System.out.println("5 *"+" "+i+" = "+5*i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---------------------------");
		
		Thread t1=new Thread();
		t1.start();
		
		
		System.out.println("---------------table of 10--------------");
		for(int i=1;i<=10;i++) {
			System.out.println("10 *"+" "+i+" = "+10*i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---------------------------");
		
		Thread t2=new Thread();
		t2.start();
		
		System.out.println("---------------table of 6--------------");
		for(int i=1;i<=10;i++) {
			System.out.println("6 *"+" "+i+" = "+6*i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("-----------------------------");
		
		Thread t3=new Thread();
		t3.start();
		
	}

}
