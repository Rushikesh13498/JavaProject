package com.oops;

public class OrderDemo {
        int order_id;
        String order_item;
        int order_qty;
        
   public OrderDemo(int oid,String item,int oqty) {
        	order_id=oid;
        	order_item=item;
        	order_qty=oqty;
        	
        }
	public void displayOrder() {
		System.out.println(order_id+" "+order_item+" "+order_qty); 
	}
	
	public static void main(String[] args) {
     
		OrderDemo myorder=new OrderDemo(1,"Harddisk",10);
		myorder.displayOrder();
	}

}
