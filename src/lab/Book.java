package lab;

   public class Book {
	int bookid;
	String bookname;
	int price;
	

	public void setBoookid(int bookid) {
		this.bookid=bookid;
	}

	public void setName(String bookname) {
		this.bookname=bookname;
	}
	
	public void setPrice(int price) {
	if(price>500) {
	double discount=price*0.15;
	double finalprice=price-discount;
	
	System.out.println("the final discounted price of book"+" "+bookname+" "+ "is: "+finalprice);
	}else {
		System.out.println("price of book is:"+price);
	}
	}
	
	public int getBookid (){
		return bookid;
	}
	public String getName() {
		return bookname;
	}
	public int getPrice() {
		return price;
	
		
	}
	
	public static void main(String[] args) {
		Book B1=new Book();
      B1.setBoookid(522);
      B1.setName("Do or Die");
      B1.setPrice(800);
      
  	Book B2=new Book();
    B2.setBoookid(322);
    B2.setName("Psychology of Money");
    B2.setPrice(500);
	
	
	}

}
