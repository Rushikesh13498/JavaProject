package com.Array;

import java.util.*;
class Mydate{
	int dd,mm,yyyy;

	public Mydate(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	@Override
	public String toString() {
		return  dd + "/"+ mm + "/"+ yyyy ;
	}
	
	
}

public class ArrayofEmployee {
	int id;
	String name;
	int salary;
	Mydate joiningdate;
	
	

	
	
	public ArrayofEmployee(int id, String name, int salary, Mydate joiningdate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningdate = joiningdate;
	}





	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", joiningdate=" + joiningdate
				+ "]";
	}

	public static void DisplayEmployeewhosejoinedafter2010(ArrayofEmployee[]er) {
		System.out.println("Employees who joined after 2010:");
		for(int i=0;i<er.length;i++) {
			if(er[i].joiningdate.yyyy>2010) {
				
				System.out.println(er[i]);
				
			}
		}System.out.println(".........No Employee found...........");
	}

public static void employeewithsamejoiningdates(ArrayofEmployee[]er) {
	System.out.println("Employees who joined at same date:");
	for(int i=0;i<er.length;i++) {
		for(int j=i+1;j<er.length;j++) {
		if(er[i].joiningdate.dd==er[j].joiningdate.dd) {
			if(er[i].joiningdate.mm==er[j].joiningdate.mm) {
				if(er[i].joiningdate.yyyy==er[j].joiningdate.yyyy) {
					
				}
			}
		}System.out.println(er[i]);
		System.out.println(er[j]);
	}
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayofEmployee er[]=new ArrayofEmployee[5];
		
		//by taking input
		
		  Scanner sc=new Scanner(System.in); 
		  for(int i=0;i<er.length;i++) {
		  System.out.println("Employee Details:");
		  System.out.println("Enter the id of Employee");
		  int id=sc.nextInt();
		  System.out.println("Enter the name of Employee:");
		  String name=sc.next();
		  System.out.println("Enter the salary of Employee:"); 
		  int salary=sc.nextInt();
		  System.out.println("Enter the date of Joining(dd):");
		  int d=sc.nextInt();
		  System.out.println("Enter the month of Joining(mm):"); 
		  int m=sc.nextInt();
		  System.out.println("Enter the year of Joining(yyyy):");
		  int y=sc.nextInt();
		  
		  Mydate m1=new Mydate(d,m,y); 
		  er[i]=new ArrayofEmployee(id, name, salary, m1);
		  
		  
		  
		  }
		 
		
		
		
		
		for(ArrayofEmployee s:er) {
			
			System.out.println(Arrays.toString(er));	
		}
		
		DisplayEmployeewhosejoinedafter2010(er);
		employeewithsamejoiningdates(er);
	} 

}
