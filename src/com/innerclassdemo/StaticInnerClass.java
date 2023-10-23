package com.innerclassdemo;

class sOuter{
	
	static class sInner {
		static void m1() {
			System.out.println("welcome ");
		}
	}
}


public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sOuter.sInner.m1();
		
	}

}
