package com.Array;

import java.util.*;

class Department1{
	int did;
	String dname;
	
	


	public Department1(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}


	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String toString() {
		return "Department:"+"id:"+ did + ", name=" + dname ;
	}
	
}


public class Employee1 {
	
	int id;
	String name;
	int salary;
	Department1 d;

	
	
	
	public Employee1(int id, String name, int salary, Department1 d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d = d;
	}




	



	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", d=" + d ;
	}
  
	public static void showSalesEmployees(Employee1 e[]) {
		
		System.out.println("Showing only Employees from Sales Department: ");
		for(int i=0;i<e.length;i++) {
			if(e[i].d.getDid()==1) {
				System.out.println(e[i]);
			}
		}
		
		
	}

public static void showsamedepartmentEmployees(Employee1 e[]) {
		
		System.out.println("Showing only Employees from Same Department: ");
		for(int i=0;i<e.length;i++) {
			for(int j=i+1;j<e.length;j++)
			if(e[i].d.getDid()==e[j].d.did) {
				
			}System.out.println(e[i]);
		}
		
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1[] e=new Employee1 [1];
		
		
		  for(int i=0;i<e.length;i++) { Scanner sc=new Scanner(System.in);
		  System.out.println("--------------Employee Details-----------------");
		  System.out.println("Enter the id of Employee"); int id=sc.nextInt();
		  System.out.println("Enter the name of employee"); String name=sc.next();
		  System.out.println("Enter the salary of employee"); int salary=sc.nextInt();
		  System.out.println("Enter the department id of the employee:(1-Sales,2-HR,3-Admin,4-Management)"); 
		  int did=sc.nextInt();
		  System.out.println("Enter the department name of employee"); String
		  dname=sc.next();
		  
		Department1 d1=new Department1(did,dname);
		e[i]=new Employee1(id,name,salary,d1);
		  
		  }
		 
		  for(int i=0;i<e.length;i++) {
				System.out.println(e[i]);
			}
		
		
		  showSalesEmployees(e);
		  showsamedepartmentEmployees(e);
		
		
		
		
		
		
	
		 
		  
		  
		
		
	
	}

}
