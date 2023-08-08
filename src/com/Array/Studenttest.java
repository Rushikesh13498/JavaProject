package com.Array;

import java.util.Arrays;

public class Studenttest {

	public static void showNames(Student12 s[]) {
		for(int i=0;i<s.length;i++) {
			if(s[i].getMarks()>80) {
				
				System.out.println(s[i]);
				System.out.println("Congratulations!!!! You passed with First Class with Distinction");
			}
		}
	}
	

	public static void main(String args[]) {

		
		  Student12 [] sarr; 
		  sarr=new Student12 [5];
		 
			/*
			 * sarr[0]=new Student12(11,"ram",91); sarr[1]=new Student12(12,"shyam",75);
			 * sarr[2]=new Student12(15,"sam",69); sarr[3]=new Student12(13,"Geeta",99);
			 * sarr[4]=new Student12(14,"Seeta",49);
			 */
		  
			/* System.out.println(Arrays.toString(sarr)); */
			/*
			 * for(int i=0;i<sarr.length;i++) { System.out.println(sarr[i]);
			 * 
			 * }
			 */
		  
		  for(Student12 s:sarr) {
			  System.out.println(s);
		
		 }
		  System.out.println("..................................");
		  System.out.println("Student whose marks are grater than 80 : ");
		  showNames((sarr));
	}
	

}
