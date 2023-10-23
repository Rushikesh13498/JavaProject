package com.thread.deadlockdemo;

public class TestDeadLock2 {
	
	public static void main(String[] args) {
		
		final String res1="JAVA";
		final String res2="SQL";
		
		Thread t1=new Thread() {
			public void run() {
				synchronized (res1) {
					System.out.println(Thread.currentThread().getName()+" has locked "+res1);
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (res2) {
						System.out.println(Thread.currentThread().getName()+" has locked "+res2);
						
					}
				}
				System.out.println(Thread.currentThread().getName()+"finished task");
			System.out.println(Thread.currentThread().getName()+"released"+res1+"and"+res2);
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				synchronized (res2) {
					System.out.println(Thread.currentThread().getName()+" has locked "+res2);
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (res1) {
					System.out.println(Thread.currentThread().getName()+" has locked"+res1);	
					}
					System.out.println(Thread.currentThread().getName()+"finished task");
					System.out.println(Thread.currentThread().getName()+"released"+res1+"and"+res2);
					
				}
			}
		};
		
		
		t1.start();
		t2.start();
		
		
	}

}
