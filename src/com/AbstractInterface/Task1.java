package com.AbstractInterface;

interface Addable{
	int a=30;
	 
}

abstract class Addition{
	int b =50;
}	

class Calculate extends Addition implements Addable{
		int c;
				
		public void Calculate () {
			int c=a+b;
			System.out.println(c);
		}
	}
	
public class Task1 {

	public static void main(String[] args) {
		Calculate result=new Calculate();
		result.Calculate();

	}

}
