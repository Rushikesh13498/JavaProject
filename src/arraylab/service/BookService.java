package arraylab.service;

import arraylab.dao.BooksDAO;
import arraylab.model.Books;

public class BookService {
 static BooksDAO bookservice;
 BooksDAO b1=new BooksDAO();
 
 public void addBookService(Books bookArray) {
	
	 b1.AddBook(bookArray);
	 
	 
 }
 
 public boolean modifyBookNameService(int bookid,String bookName) {
	 b1.modifyBookName(bookid, bookName);
	return true;
 }

 public boolean modifyBookprice(int bookid,float bookprice) {
	 b1.modifyBookprice(bookid, bookprice);
	return true;
	 
	 
 }
 
 
	public  Books getallBookService(Books newbook){
		return newbook ;
		
	}

	public BookService() {
		// TODO Auto-generated constructor stub
	}
	
	

	}
