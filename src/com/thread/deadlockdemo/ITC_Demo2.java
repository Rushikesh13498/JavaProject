package com.thread.deadlockdemo;

class Account{
	int bal=10000;
	
	public synchronized void withdraw(int amt) {
		System.out.println(Thread.currentThread().getName()+" wants to withdraw Rs. "+amt);
		if(bal<amt) {
			System.out.println("----------------------------------------------");
		System.out.println("------insufficient balance------"+"\nRs.:"+bal);
		System.out.println(Thread.currentThread().getName()+"waiting for deposit");
		System.out.println("--------------------------------------------------");
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		withdraw(amt);
		}
		else {
			bal=bal-amt;
			System.out.println("----------------------------");
			System.out.println("withdraw completed by "+Thread.currentThread().getName()+" of Rs. "+amt);
			System.out.println("available balance is :"+bal);
			
		}
	}
	
	public synchronized void deposit(int amt) {
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println(Thread.currentThread().getName()+"going for deposit");
		bal=bal+amt;
		System.out.println(Thread.currentThread().getName()+" has deposited"+amt);
		notify();
		System.out.println("------------------------------------");
	}
	
}


public class ITC_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a =new Account();
		Thread t1=new Thread() {
			
			public void run() {
				a.withdraw(25000);
			}
		};
		t1.setName("son ");
		
		Thread t2=new Thread() {
			public void run() {
				a.deposit(100000);
			}
		};
		t2.setName("father ");
		
		t1.start();
		t2.start();
	}

}
