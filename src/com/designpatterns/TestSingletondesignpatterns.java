package com.designpatterns;

public class TestSingletondesignpatterns {

	public static void main(String[] args) {
		
		Book b1=new Book();
		
		b1.getBook();
		System.out.println(b1.hashCode());
	}
}
