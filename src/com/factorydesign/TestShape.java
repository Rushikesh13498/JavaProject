package com.factorydesign;
import java.util.*;
public class TestShape {

	public static void main(String[] args) {
		
		Shapefactory factory=new Shapefactory();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shape...");
		String shapename=sc.next().toLowerCase();
		Shape shapeobj;
		shapeobj=factory.getShape(shapename);
		
		if(shapeobj!=null) {
			shapeobj.draw();
		}else {
			System.out.println("selected shape is not available");
		}
		
	}
}
