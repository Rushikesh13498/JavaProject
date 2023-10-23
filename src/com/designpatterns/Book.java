package com.designpatterns;
//how to create singleton patterns 
//private constructor
//stsatic member/method


public class Book {

	private static Book book;
	Book() {
		
	}
	
	public static Book getBook() {
		if(book==null) {
			book=new Book();
		}
		return book;
	}
	
}
