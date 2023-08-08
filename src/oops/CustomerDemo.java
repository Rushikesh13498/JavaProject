package oops;

public class CustomerDemo {
 
	 int cust_id;
	 String cust_name;
	 
	 public CustomerDemo() {
		 System.out.println("I am a Customer");
	 }
	 
	 public CustomerDemo(int x) {
		 System.out.println("x="+x);
	 }
	 
	 public CustomerDemo(int cid,String cname) {
		 
	 }
	public static void main(String[] args) {
		CustomerDemo c1=new CustomerDemo(10);
		CustomerDemo c2=new CustomerDemo();
	}

}
