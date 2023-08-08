package com.staticdemos;

public class StaticDemo1 {

	static int x=10;
	
	public void change() {
		x=20;
		System.out.println(x);
		
	}
	public void show() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		StaticDemo1 d=new StaticDemo1();
		d.show();
		d.change();
	}

}
