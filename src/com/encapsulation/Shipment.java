package com.encapsulation;

class Order{
	int oid;
	String cname;
	String cityname;
	
	public Order(int oid,String cname,String cityname) {
		this.oid=oid;
		this.cname=cname;
		this.cityname=cityname;
		
	}
	public void showOrder() {
		System.out.println(oid+" "+cname+" "+cityname);
	}
}
class Mydate{
	int dd;
	int mm;
	int yy;
	
	public Mydate(int dd,int mm,int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void showMydate() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}


public class Shipment {
	
	int id;
    Order O;
    Mydate M;
	
    public Shipment(int id,Order O,Mydate M) {
    	this.id=id;
    	this.O=O;
    	this.M=M;
    }
    public void showShipment() {
    	System.out.println(id);
        O.showOrder();
        M.showMydate();
        
    }
    
	
	
	public static void main(String[] args) {
		
      Shipment s=new Shipment(22,new Order(11523,"Rushi","Pune"),new Mydate(04,04,23));
	  System.out.println(s);
      s.showShipment();
	
	}

}
