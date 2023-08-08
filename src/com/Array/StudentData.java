package com.Array;

import java.util.Arrays;

public class StudentData {
	
	int roll;
	String name;
	double marks;
	

	public StudentData(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentData [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public static void sortRecords(StudentData s[]) {
		
		
	}
	
	public static void showRecords(StudentData s[]) {
		for(StudentData st:s) {
			System.out.println(Arrays.toString(s));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentData st[]=new StudentData[4];
		
		
		StudentData s1=new StudentData(1, "ram", 80);
		StudentData s2=new StudentData(2, "jalaram", 84);
		StudentData s3=new StudentData(3, "ghanshyam", 68);
		StudentData s4=new StudentData(4, "balram", 98);
		
		showRecords(st);
	}

}
