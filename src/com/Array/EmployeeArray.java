package com.Array;

import java.util.Scanner;

class Employee{
	int id;
	String name;
	int salary;
	
	
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return id+" "+name+" "+salary;
	}
}

public class EmployeeArray {

	public static void displayEmployeewithsalarygraterthan10000(Employee e[]) {
		
		for(int i=0;i<e.length;i++) {
			if(e[i].salary>10000) {
				System.out.println("................................................");
				System.out.println("Employee whose salary is greater than 10000:");
				System.out.println(e[i]);
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee[] e=new Employee[1];
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<e.length;i++) {
		System.out.println("Enter the employee id:");
		int id=sc.nextInt();
		System.out.println("Enter the Employee Name:");
	    String name=sc.next();
	    System.out.println("Enter the Salary of Employee:");
	    int salary=sc.nextInt();
	
	    e[i]=new Employee(id,name,salary);

	}
	for (Employee s:e) {
		System.out.println(s);
	}
	
	 EmployeeArray er=new  EmployeeArray();
	 er.displayEmployeewithsalarygraterthan10000(e);
	
	
	
	
}
}
