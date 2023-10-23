package com.thread.deadlockdemo;

public class Shared {

	synchronized void javaTest(Shared s2) {

		System.out.println("JAVA test has started");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s2.sqlTest();
		System.out.println("JAVA test ended ");

	}

	synchronized void sqlTest() {
		System.out.println("SQL test has started");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("SQL test ended");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void method1() {
		// TODO Auto-generated method stub
		
	}

}
