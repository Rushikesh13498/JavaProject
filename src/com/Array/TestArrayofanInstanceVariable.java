package com.Array;

public class TestArrayofanInstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student233 s1=new Student233(101,"ram",new double [] { 45,65,95});
		//or
		double m1[]= {56,75,78};
		double m2[]= {56,96,70};
		double m3[]= {56,66,89};
		double m4[]= {56,56,78};
	
	Student233 s2=new Student233(101,"ram",m1); 
	Student233 s3=new Student233(102,"balram",m2); 	
	Student233 s4=new Student233(103,"shyaam",m3); 
	Student233 s5=new Student233(104,"sam",m4); 
	
	System.out.println("------------------Student1---------------------");
	s2.display();
	
	System.out.println("--------------Student2----------------------");
	s3.display();
	
	System.out.println("------------------------------USing toString-----------------------");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	
	
	
	
	
	}
	
	
	

}
