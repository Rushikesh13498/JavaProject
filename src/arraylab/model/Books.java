package arraylab.model;
import java.util.*;
public class Books {
	
	int bookid;
	String bookName;
	float bookPrice;
	
	public  Books() {
	
		
	}
	

	public Books(int bookid, String bookName, float bookPrice) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public float getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}


	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}



}
