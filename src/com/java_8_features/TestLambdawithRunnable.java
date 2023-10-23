package com.java_8_features;

public class TestLambdawithRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r=()->{
			System.out.println("thread is running");
		};
		Thread t1=new Thread(r);
		t1.start();
		
	}

}
