package com.Array;

import java.util.Arrays;

public class Student4 {

	int rollno;
	String name;
	int marks[];
	
	
	
	public Student4(int rollno, String name, int[] marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}



	
	  public void display() { System.out.println("Rollno:"+rollno);
	  System.out.println("Name:"+name); System.out.println("marks:"); for(int
	  i=0;i<marks.length;i++) { System.out.print(" "+marks[i]+" ");
	  
	  
	  } System.out.println("\n.............................");
	  
	  
	  }
	 


	/*
	 * @Override public String toString() { return "Student4 [rollno=" + rollno +
	 * ", name=" + name + ", marks=" + Arrays.toString(marks) + "]"; }
	 */



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student4 s=new Student4(1, "Sam", new int[] {96,63,56,99,50});
		Student4 s1=new Student4(2, "Ram", new int[] {66,93,86,89,40});
		Student4 s2=new Student4(3, "Seeta", new int[] {46,53,56,99,80});
		Student4 s3=new Student4(4, "Geeta", new int[] {96,52,63,79,60});
		s.display();
		s1.display();
		s2.display();
		s3.display();
	}

}
