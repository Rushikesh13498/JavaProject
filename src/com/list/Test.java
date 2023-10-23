package com.list;
public class Test {
	abstract class A{
		void show() {
			System.out.println("hii");
		}
	}
	class b{
		void show() {
			System.out.println("hii");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="core";
		System.out.println(s.hashCode());
		s=s+"java";
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s.intern());
		
	
		
	}

}
