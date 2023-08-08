package arraylab.dao;

import java.util.Scanner;

import arraylab.model.Books;

public class BooksDAO {

	static Books[] bookArray=new Books[5];
	 static int index=0;
	
	public void AddBook(Books book) {
		
		
		bookArray[index++]=book;
		
	}
	
	public void modifyBookName(int bookid,String bookName) {
		boolean ispresent=false;
		
	for(int i=0;i<bookArray.length;i++) {
			if(bookArray[i].getBookid()==bookid) {
				bookArray[i].setBookName(bookName);
				ispresent=true;
			}else {
				
				ispresent= false;
			}
		}
	}
	
	public void modifyBookprice(int bookid,float bookprice) {
		boolean ispresent=false;
		
	for(int i=0;i<bookArray.length;i++) {
			if(bookArray[i].getBookid()==bookid) {
				bookArray[i].setBookPrice(bookprice);
				ispresent=true;
			}else {
				
				ispresent= false;
			
		}
	}
	
	
		
		
	}
public static void main(String[]args) {
	
	BooksDAO b1=new BooksDAO();
	
	b1.AddBook(new Books(1,"money",300));
	b1.AddBook(new Books(2,"money2",400));
	b1.AddBook(new Books(3,"money1",500));
	
	b1.modifyBookName(1, "java");
	System.out.println(b1);
	
	
	
	
}

	

}
