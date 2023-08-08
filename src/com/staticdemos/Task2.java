package com.staticdemos;

public class Task2 {
	static int x=100;
	int y=50;
	
	public void show() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public void display() {
		System.out.println(x);
		Task2 app=new Task2();
		System.out.println(app.y);
	}

	public static void main(String[] args) {
	
		Task2 app1=new Task2();
		app1.show();
		
		System.out.println();
		
		app1.display();

	}

}
