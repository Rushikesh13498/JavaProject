package com.Array;

import java.util.Arrays;

public class Student233 {
	
	private int rollno;
	private String name;
	private double marks[];
	
	

	public Student233(int rollno, String name, double[] marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public void  display () {
		System.out.println("rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Marks"+Arrays.toString(marks));
	}


	
	public String toString() {
		return "Student233 [rollno=" + rollno + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
