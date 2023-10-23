package com.oops;

public class Shopping {

	int product_id;
	String product_name;
	int price;
	int qty;
	
	public void acceptproductDetails(int pid,String pname,int  pprice,int q)
	{
		product_id=pid;
		product_name=pname;
		price=pprice;
		qty=q;
		
	}
	public void display()
	{
		System.out.println(product_id+" "+product_name+" "+price+" "+qty);
		
	}
	public static void main(String[] args) {
		Shopping shop1=new Shopping();
		shop1.acceptproductDetails(102, "Jeans", 1000, 3);
        shop1.display();
	}

}
