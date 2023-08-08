package com.staticdemos;

import oops.Studentclass;

public class OtherPackageStudent extends Studentclass {

	 private int rollno=76;
	
	 private void doprivate() {
		 System.out.println();
	 }
	 
	 private void display() {
		 System.out.println(rollno);
	 }
	 
	public static void main(String[] args) {
		
		OtherPackageStudent s1=new OtherPackageStudent();
		s1.display();
		s1.doPublic();

	}

}
