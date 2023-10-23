package com.java_8_features;

interface Multiply{
	int multiply(int x,int y);
}

public class Testlambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiply m=(x,y)->{
			return x*y;
		};
		System.out.println("ans is:"+m.multiply(10, 20));
		int ans=m.multiply(10, 200);
		System.out.println("ans:"+ans);
		
		
		//without return keyword
Multiply m1=(x,y)->(x*y);
int result=m1.multiply(20, 25);
System.out.println("result is:"+result);
	
	}
	

}
