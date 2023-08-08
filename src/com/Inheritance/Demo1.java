package com.Inheritance;

class Mobile{
	String memorySize="128GB";
	
}
class Apple extends Mobile{
String camera="50MP";
}
class Iphone extends Apple{
	String name="iphone14 pro max";


public void showDetails() {
	System.out.println(memorySize+" "+camera+" "+name);
}
}
public class Demo1 {
	public static void main(String[] args) {
		Iphone p=new Iphone();
		p.showDetails();

	}

}





