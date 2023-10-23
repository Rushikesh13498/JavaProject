package com.java_8_features;

class food{
	public static void eat() {
		System.out.println("healthy food");
	}
}


interface Human{
	void eat();
}
public class Testmethodrefbystaticmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h=food::eat;
		h.eat();
	}

}
