package com.Inheritance;

class Animal{
	String foodtype;
	
}

class Dog extends Animal{
	
	public void showfood() {
		foodtype="Dogfood";
		System.out.println(foodtype);
	}
}
public class SingleDemo {

	public static void main(String[] args) {
		Dog tommy=new Dog();
		tommy.showfood();
	}

}
