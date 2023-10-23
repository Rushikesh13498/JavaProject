package com.thread;

class ThreadDemo extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().isAlive());
	System.out.println("-------start-------");
	for(int i=0;i<5;i++) {
		System.out.println("i="+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("---------end----------");
	}
}


public class isAlivemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadDemo t1=new ThreadDemo();
		System.out.println("Thread-0-->"+t1.isAlive());
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		ThreadDemo t2=new ThreadDemo();
		t2.start();
		System.out.println("Thread-0--->"+t1.isAlive());
		
	}

}
