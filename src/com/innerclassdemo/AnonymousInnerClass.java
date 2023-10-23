package com.innerclassdemo;
//anonymous class which does not have name

//subclass (class or interface)

abstract class Animal {
	abstract void eat();
}

class Dog extends Animal {
	public void eat() {
		System.out.println("eating");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Animal() {
			public void eat() {
				System.out.println("eating");
			}
		}.eat();

		 Animal Dog=new Animal() { 
			  public void eat() {
			  System.out.println("dog is eating");
			  }
			  };
			  
		
		  Animal Cat=new Animal() { 
		  public void eat() {
		  System.out.println("cat is eating");
		  }
		  };
		  

	}

}
