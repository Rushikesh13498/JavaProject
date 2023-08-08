package com.AbstractInterface;

interface Eatable{
	public void eat();
	
	abstract class Grapes{
		void eat(){
			
		}
	}
}

abstract class Litchi{
	
	
	abstract class Juice{
		public  void drink() {
			
		}
	}
}

class Apple extends Litchi implements Eatable{

	@Override
	public void eat() {
		
		System.out.println("you can eat grapes.....");
	}

	public  void drink() {
		System.out.println("you can drink litchi juice...... ");
	}

	

	
}

public class Task2 {

	public static void main(String[] args) {
		Apple s=new Apple();
		s.eat();
		s.drink();

	}

}
