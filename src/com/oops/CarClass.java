package com.oops;

public class CarClass {
	  String name;
	  String model;
	  String color;
	  int price;
	

	public static void main(String[] args) {
		
		CarClass car = new CarClass();
		
		car.name = "BMW";
		car.model = "720d";
		car.color = "white";
		car.price = 4500000;

		System.out.println(car.name+" \n"+car.model+" \n"+car.color+" \n"+car.price);
		System.out.println("............................");
		
		CarClass car2= new CarClass();
		car2.name = "Audi";
		car2.model = "A8L";
		car2.color = "Red";
		car2.price = 5500000;
		
		System.out.println(car2.name+" \n"+car2.model+" \n"+car2.color+" \n"+car2.price);
		System.out.println("............................");
		
		
		CarClass car3= new CarClass();
		car3.name = "Suzuki";
		car3.model = "Swift";
		car3.color = "Black";
		car3.price = 750000;
		
		System.out.println(car3.name+" \n"+car3.model+" \n"+car3.color+" \n"+car3.price);
		System.out.println("............................");
		
		
		
		
		
		
	}

}
