package com.innerclassdemo;

class Outer1{
	private int a=10;
	
	public void show () {
		
		class OneInner{
			
			public void m1() {
				System.out.println("hello...");
			}
		}
		new OneInner().m1();
	}
}

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer1 obj=new Outer1();
		obj.show();
		
	}

}
