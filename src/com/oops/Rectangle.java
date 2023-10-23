package com.oops;

public class Rectangle {
	int length;
	int breadth;
	
	public void acceptDetails(int l,int b) {
		length=l;
		breadth=b;
	}

	public void Area() {
		int Area=length*breadth;
		System.out.println("Area of Rectangle is:"+Area);
	}
	public void display() {
		System.out.println(length+" "+breadth+" ");
	}
	
	public static void main(String[] args) {
		
		Rectangle R1=new Rectangle();
		R1.acceptDetails(6, 5);
		R1.display();
        R1.Area();
    
        Rectangle R2=new Rectangle();
        R2.acceptDetails(8, 6);
	    R2.display();
	    R2.Area();
	
	}
	
	

}
