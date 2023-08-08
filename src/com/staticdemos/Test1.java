package com.staticdemos;

public class Test1 {
	
	int a;
	
	public void acceptvariable(int a) {
		this.a=a;
		
	}
	public void input() {
		System.out.println("a:"+a);
		this.acceptvariable(100);
		System.out.println(a);
	}

	public static void main(String[] args) {
	
		Test1 u=new Test1();
		u.acceptvariable(50);
		u.input();
	}

}
