package com.innerclassdemo;

class Outer{
	private int a=10;
	
	class Inner{
		int b=20;
		
		public void show() {
			System.out.println("a:"+a);
			System.out.println("b:"+b);
		}
	}
	public void display() {
		System.out.println("a:"+a);
	}
}

public class NestedInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj=new Outer();
		obj.display();
		
		Outer.Inner obj1=obj.new Inner();
		obj1.show();
		
	
		
		
		
	}

}
