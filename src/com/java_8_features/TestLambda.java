package com.java_8_features;

interface Vehicle{
	void drive();
}

class Car implements Vehicle{
	public void drive() {
		System.out.println("car is fast");
	}
}

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//with subclass
		Car c=new Car();
		c.drive();
		
		//or(with upcasting)
		Vehicle v=new Car();
		v.drive();
		
		//anonymous class
		Vehicle bike=new Vehicle() {

			@Override
			public void drive() {
				// TODO Auto-generated method stub
				System.out.println("bike is awesome");
			}
		
	};
	bike.drive();
	
	Vehicle auto=()->{
		System.out.println("Auto is driving");
	};
	auto.drive();
	

}
}
