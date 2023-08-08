package arraylab.view;
import java.util.Scanner;

import arraylab.model.Books;
import arraylab.service.BookService;

public class BooksView {
	 static int choice;
	
	 Books newbook=new Books();
	Scanner sc=new Scanner(System.in);
	static BookService bookservice=new BookService();

	public void AddBook() {
		System.out.println("Enter the bookid:");
		int bookid=sc.nextInt();
		System.out.println("Enter the bookname:");
	    String bookName=sc.next();
	    System.out.println("Enter the book price");
	    int bookPrice=sc.nextInt();
	    
	    Books newbook=new Books(bookid,bookName,bookPrice);
	    bookservice.addBookService(newbook);
	 System.out.println(newbook);
	 
	
	}
	public void ModifyBookName() {
		System.out.println("Enter the bookid:");
		int bookid=sc.nextInt();
		System.out.println("enter the new name of book");
		String bname=sc.next();
		
	bookservice.modifyBookNameService(bookid, bname);
	
	 bookservice.getallBookService(newbook);
	
	}
	
	public void ModifyBookPrice() {
		System.out.println("Enter the bookid:");
		int bookid=sc.nextInt();
		System.out.println("enter the new price of book");
		float price=sc.nextFloat();
		
		boolean p=bookservice.modifyBookprice(bookid, price);
		bookservice.getallBookService(newbook);

		if(p) {
			System.out.println("modified successfully");
		}else {
			 System.out.println("Bookid not found");
		}
	 
	}
	
	
	

	public void menu() {
		
		BooksView b=new BooksView();
		 do {
			  
			  System.out.println("..............MENU................");
		        System.out.println("please choose one option from below");
		 
		  System.out.println("1.Add a new Book.");
		  System.out.println("2.Modify Book Name.");
		  System.out.println("3.Modify Book Price.");
		  System.out.println("4.EXIT...4");
		  System.out.println("Enter the Choice(1-4)"); 
		  choice=sc.nextInt();
		  
		  switch(choice) {
		  case 1:
		   b.AddBook();  
		   System.out.println("Book is Added to the Array");
			 System.out.println("Do you wish to perform more operation (y=continue/n=terminate)");
			 String ch=sc.next();
			 if(ch=="n") {
				 System.out.println("Thank you!!!!");
				 System.out.println();
			 }else {
				 continue;
			 }
		  
		  case 2:
			  b.ModifyBookName();
			  
		  case 3:
			  b.ModifyBookPrice();
		  case 4:
				System.out.println("Thank You !!!");
				System.out.println(".....................");
		  }
		  }while(choice !=4);
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Books[]bookArray=new Books[3]; 
		  BookService b1=new BookService();
		
		  BooksView bb=new BooksView();
		 
		  bb.menu();
}
}
