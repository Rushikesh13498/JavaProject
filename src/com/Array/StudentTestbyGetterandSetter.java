package com.Array;

import java.util.Scanner;
 public class StudentTestbyGetterandSetter {
	 
	 public void StudentDisplay(Student12 str[]) {

		 System.out.println("Enter data for student array by creating method");
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<str.length;i++) {
				str[i]=new Student12();
			
			System.out.println("ENter RollNo");
			str[i].setRollno(sc.nextInt());
			
			System.out.println("Enter name:");
			str[i].setName(sc.next());
			
			System.out.println("Enter marks:");
			str[i].setMarks(sc.nextDouble());
			}
	 }
	public  static void	 showStudentData(Student12 []str ) {
				for(Student12 a:str) { 
					System.out.println(a); }
			}
	 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student12 str[]=new Student12[3];
		/*
		 * System.out.println("Enter data for student array"); Scanner sc=new
		 * Scanner(System.in);
		 * 
		 * for(int i=0;i<str.length;i++) { str[i]=new Student12();
		 * 
		 * System.out.println("ENter RollNo"); str[i].setRollno(sc.nextInt());
		 * 
		 * System.out.println("Enter name:"); str[i].setName(sc.next());
		 * 
		 * System.out.println("Enter marks:"); str[i].setMarks(sc.nextDouble()); }
		 */
		System.out.println("---------display----------");
	
		StudentTestbyGetterandSetter st=new StudentTestbyGetterandSetter();
		st.StudentDisplay(str);
		st.showStudentData(str);
		
		
		
		  
		 
	
	
	}
	
	

}
