package com.Inheritance;

class Vehicle{
	
	
		int wheels=10;
	
}

class Car extends Vehicle{
	void showCar() {
		wheels=4;
		System.out.println(wheels);
		
	}
}
class Truck extends Vehicle{
	void showTruck() {
		wheels=12;
	System.out.println(wheels);
}
}
public class HierarchicalDemo {

	public static void main(String[] args) {
		Car c=new Car();
		c.showCar();
				
		Truck t=new Truck();
		t.showTruck();

	}

}
