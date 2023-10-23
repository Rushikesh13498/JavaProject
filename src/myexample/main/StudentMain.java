package myexample.main;

import java.util.Scanner;

import myexample.model.Student;

public class StudentMain {
	
	static Student[] s=new Student[2];
	static int index=0;

	
	public  void addStudent() {
		
		

	
			int id = 0,age = 0;
			String name = null;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student id:");
			 id =sc.nextInt();
			
			System.out.println("Enter student name:");
			 name=sc.next();
			
			System.out.println("Enter student age:");
			age=sc.nextInt();
				
			
			Student st=new Student(id, name, age);
			
				st.setId(id);
				st.setName(name);
				st.setAge(age);
				
			if(!checkStudentRecord(st)) {
				s[index]=st;
				index++;
			}else {
				System.out.println("Student record already exists..");
			}
	
	}
	
	public boolean  checkStudentRecord(Student st) {
	boolean t=false;
		for(Student str:s) {
		if(str!=null) {
			if(str.equals(st)) {
	           t=true;		
		     break;
		}
				
		}
		}return t;
		
		
	}
	
	
	public void display() {
		for(Student sarr:s) {
			if(sarr!=null) {
			System.out.println(sarr);
		}
	}
		System.out.println();
		}

	public static void main(String[] args) {
		StudentMain st = new StudentMain();
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			  
			  System.out.println("..............MENU................");
		        System.out.println("please choose one option from below");
		 
		  System.out.println("1.Add a student.");
		  System.out.println("2.Display student.");
		  System.out.println("3.EXIT...");
		  System.out.println("Enter the Choice(1-3)"); 
		  choice=sc.nextInt();
		  
		  switch(choice) {
		  
		  case 1:
			  st.addStudent();
			  break;
		
		  case 2:
			  st.display();
		  break;
		  
		  case 3:
			  System.out.println("Thank you!!!!!");
		  }
		
		
		
	
		}while(choice!=3);
}
}
