package com.synchronisation;

import com.Nested.tableof1to5;

class Table{
	
	public static synchronized void print(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
			try {
				Thread.currentThread().sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class StaticsynTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
     Thread t1=new Thread() {
    	 public void run() {
    		 Table.print(5);
    	 }
     };
     
     Thread t2=new Thread() {
    	 public void run() {
    		 Table.print(6);
    	 }
     };
     Thread t3=new Thread() {
    	 public void run() {
    		 Table.print(15);
    	 }
     };
     Thread t4=new Thread() {
    	 public void run() {
    		 Table.print(52);
    	 }
     };
     Thread t5=new Thread() {
    	 public void run() {
    		 Table.print(29);
    	 }
     };
		
     t1.start();
     t2.start();
     t3.start();
     t4.start();
     t5.start();
	}

}
