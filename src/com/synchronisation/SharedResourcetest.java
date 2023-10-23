package com.synchronisation;


class Print {
	public static void printName(String name) {
		System.out.println("{"+name);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("}");
	}
}


public class SharedResourcetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Print p=new Print();
Thread t1=new Thread() {
	public void run() {
		p.printName("Rushi");
	}
};
Thread t2=new Thread() {
	public void run() {
		p.printName("Venky");
	}
};
Thread t3=new Thread() {
	public void run() {
		p.printName("Dnyani");
	}
};
Thread t4=new Thread() {
	public void run() {
		p.printName("Ashu");
	}
};

t1.start();
t2.start();
t3.start();
t4.start();

	}

}
