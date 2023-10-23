package com.oops;

public class Shopping1 {

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
	
	public void calculateBill() {
		if(qty>0) {
			int Totalbill=price*qty;
			System.out.print("Totalbill is :"+Totalbill);
		}else {
			System.out.println("Error");
	
		}
	}
	public void display()
	{
		System.out.println(product_id+" \n"+product_name+" \n"+price+" \n"+qty+" \n");
		
	}
	public static void main(String[] args) {
		Shopping1 shop1=new Shopping1();
		shop1.acceptproductDetails(102, "Jeans", 1000,3);
        shop1.display();
        shop1.calculateBill();	
	}
	

}

