package com.java_8_features;

class Flower{
	
	public void color() {
		System.out.println("color is red");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
}

interface Colorable{
	void showcolor();
}


public class TetmethodbyInstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//with lambda expression
		Colorable c=()->{
			System.out.println("color is red");
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		};
		c.showcolor();
		
		//method ref by instance method
		Flower obj=new Flower();
		Colorable cl=obj::color;
		//or Colorable cl=new Flower()::color; 
		cl.showcolor();
	}

}
                                                                    