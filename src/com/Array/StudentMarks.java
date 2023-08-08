package com.Array;

import java.util.Arrays;
import java.util.Scanner;

class Student1{
	int id;
	String name;
	int[] marks;
	double P;
	
	public Student1(int id,String name,int[] mk) {
		this.id=id;
		this.name=name;
		this.marks=mk;
	}
	public String toString() {
		return id+" "+name+" "+Arrays.toString(marks);
	}

	
	  void Percentage(int mk[],double P){
		  this.P=P;
		  for (int i=0;i<mk.length;i++) {
	  int sum = 0;
	  sum+=mk[i];
	  P=sum/3;
	  System.out.println(P);
	  }
		  }
	 
}
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student12[] s=new Student12[4];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s.length;i++) {
        System.out.println("Enter the student id: ");
        int id=sc.nextInt();
        System.out.println("Enter the student name:");
        String name=sc.next();
        System.out.println("Enter the marks:");
        int marks[]=new int[3];
        for(int j=0;j<marks.length;j++) {
        	marks[j]=sc.nextInt();
        }double Percentage=marks[3]/3;
    	System.out.println(Percentage);
		/*
		 * int mk[]=new int[i]; for (int j=0;i<mk.length;j++) { mk[j]=sc.nextInt(); }
		 */
        s[i]=new Student12();
        }
        System.out.println(".............................");
        for(Student12 e:s) {
        	System.out.println(s);
        }
      /*  for(int i=0;i<s.length;i++) {
    		if(s[i].marks>60) {
    			System.out.println(s[i]);
        	*/
       
        System.out.println(".....................................");
        
	    
	
	
}
}

