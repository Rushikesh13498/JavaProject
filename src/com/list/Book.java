package com.list;

import java.util.*;

public class Book {
	private int bookid;
	private String bookname;
	private double price;
	
	

	


	public Book(int bookid, String bookname, double price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
	}



	public int getBookid() {
		return bookid;
	}



	public void setBookid(int bookid) {
		this.bookid = bookid;
	}



	public String getBookname() {
		return bookname;
	}



	public void setBookname(String bookname) {
		this.bookname = bookname;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book>b=new ArrayList<Book>();
		
		b.add(new Book (101,"Manifest",1000));
		b.add(new Book (102,"java",630));
		b.add(new Book (104,"psychology of money",600));
		b.add(new Book (105,"5AM club",750));
		b.add(new Book (106,"intelligent investor",650));
		b.add(new Book (108,"ikigai",500));
		b.add(new Book (110,"how to win friends and influence people",800));
		b.add(new Book (108,"ikigai",500));
		b.add(new Book (110,"how to win friends and influence people",800));
	
		for(Book blist:b) {
			System.out.println(blist);
		}
		int count=0;
		for(int i=0;i<b.size();i++) {
			for(int j=i+1;j<b.size();j++) {
				if(b.get(i).getPrice()==b.get(j).getPrice()) {
					count++;
					System.out.println("--------------book with same price -------------");
					System.out.println("price-->"+b.get(i).getPrice());
				}
			}
		}System.out.println("No of books with same price-->"+count);
		
		System.out.println();
		System.out.println("same book objects");
		boolean samebookobject=true;
		for(int i=0;i<b.size();i++) {
			for(int j=i+1;j<b.size();j++) {
				if(b.get(i).getBookid()==b.get(j).getBookid()) {
					if(b.get(i).getBookname()==b.get(j).getBookname()) {
						if(b.get(i).getPrice()==b.get(j).getPrice()) {
							
							System.out.println("Same objects-->"+b.get(i));
							
		                  samebookobject=false;
		                  b.remove(j);
						}
					}
				}
			}
			
	}
		
	
		if(!samebookobject) {
			System.out.println();
			System.out.println("----------------------OG book set-----------------------");
			System.out.println(b);
		}
	}
}


