package com.Array;

import java.util.*;
public class StudentArray {
	int id;
	String name;
	int age;
	double marks;


	public StudentArray(int id, String name, int age, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentArray [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	public static void displayStudentsmarksmorethan60(StudentArray[]s) {

        System.out.println();
		System.out.println("................................................");
		System.out.println("Students whose marks are grater than 60:");
		for(int i=0;i<s.length;i++) {
			if(s[i].marks>60) {
				
				System.out.println(s[i]);
			}
		}
	}
	
	public static void displayStudentAge(StudentArray[]s) {
		System.out.println("................................................");
		System.out.println("Students whose age is less than 15:");
		for(int i=0;i<s.length;i++) {
			if(s[i].age<15) {
				
				System.out.println(s[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		StudentArray[] s=new StudentArray[3];
		
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter the id of student:");
			int id=sc.nextInt();
			System.out.println("Enter the name of student:");
			String name=sc.next();
			System.out.println("Enter the age of student:");
			int age=sc.nextInt();
			System.out.println("Enter the marks of student:");
			double marks=sc.nextDouble();
			
			s[i]=new StudentArray(id, name, age, marks);
		}
			for(StudentArray sarr:s) {
				System.out.println(sarr);
			}
          
			displayStudentsmarksmorethan60(s);
			displayStudentAge(s);
			
	}

}
