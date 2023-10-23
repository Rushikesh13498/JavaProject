package lab;

import java.util.*;

class Order{
	int o_id;
	String o_date;
	String courier_name;

	
	public Order(int o_id, String o_date, String courier_name) {
		super();
		this.o_id = o_id;
		this.o_date = o_date;
		this.courier_name = courier_name;
	}
	
	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", o_date=" + o_date + ", courier_name=" + courier_name + "]";
	}
	
	
}
class Customer{
	int c_id;
	String c_name;
	String city;
	Order o;

	public Customer(int c_id, String c_name, String city, Order o) {
	super();
	this.c_id = c_id;
	this.c_name = c_name;
	this.city = city;
	this.o = o;
}
@Override
public String toString() {
	return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", city=" + city + ", o=" + o + "]";
}

}

public class Customershipment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Customer> al=new ArrayList<Customer>();
   
   al.add(new Customer(1,"mr x","mumbai",new Order(1,"2008/02/06","fed-ex")));
   al.add(new Customer(2,"mr y","mumbai",new Order(2,"2005/01/01","Gati-KWE")));
   al.add(new Customer(3,"mr z","mumbai",new Order(3,"2006/03/06","DTDC")));
	
	for(Customer c:al) {
		System.out.println(c);
	}
	
	
	
	
	}

}
