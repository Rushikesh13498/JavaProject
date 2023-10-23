package com.synchronisation;


class Print2{
	public synchronized void printName(String name) {
		System.out.print("{"+name);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("}");
	}
	
}

class MyThread1 extends Thread{
	Print2 p;
	String n;
	
	public MyThread1(Print2 p,String n) {
		this.p=p;
		this.n=n;
				
	}
	public void run() {
		p.printName(n);
	}
	
}
public class SharedResourcetestsynchronised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Print2 p=new Print2();
		MyThread1 t1=new MyThread1(p, "rushi");
		MyThread1 t2=new MyThread1(p, "ashu");
		MyThread1 t3=new MyThread1(p, "venky");
		MyThread1 t4=new MyThread1(p, "dnyaneshwar");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}

}
