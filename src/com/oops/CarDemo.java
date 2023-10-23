package com.oops;

public class CarDemo {
	int modelno;
	String car_name;
	int price;
	
   public CarDemo(int mid,String cname,int amount)
   {
	   modelno=mid;
	   car_name=cname;
	   price=amount;
   }
   
   public void showCar() {
	   System.out.println(modelno+"\n"+car_name+"\n"+price+"$");
   }
   
   public static void main(String[] args) {
		CarDemo Audi = new CarDemo(2344,"R8",1000000);
		Audi.showCar();
	   
	   
	   
	   
	}

}
