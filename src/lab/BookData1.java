package lab;

public class BookData1 {
	private String bookname;
	private int bookPrice;
	private String authorname;
	

	public String getBookname() {
		return bookname;
	}



	public void setBookname(String bookname) {
		this.bookname = bookname;
	}



	public int getBookPrice() {
		return bookPrice;
	}



	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}



	public String getAuthorname() {
		return authorname;
	}



	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BookData1 book=new BookData1();
      
      System.out.println("Enter the book name:");
      book.setBookname("JAVA");
      
      System.out.println("Enter the price of book:");
      book.setBookPrice(500);
      
      System.out.println("Enter the name of author:");
      book.setAuthorname("Einstein");
      
      System.out.println("Book Details :");
      System.out.println("book name:"+book.getBookname());
      System.out.println("book price:"+book.getBookPrice());
      System.out.println("author name:"+book.getAuthorname());
		
		
		
		
	}

}
