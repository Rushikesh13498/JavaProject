package com.encapsulation;

class Employee{
	int eid;
	String ename;
	
	public Employee(int eid,String ename) {
		this.eid=eid;
		this.ename=ename;
		
	}
	public void showEmp() {
		System.out.println(eid+" "+ename);
	}
}

public class Department {
	int did;
	String dname;
	Employee emp;
	
	public Department(int did,String dname,Employee emp) {
		this.did=did;
		this.dname=dname;
		this.emp=emp;
	}

public void showDept()
{
System.out.println(did+" "+dname);	
emp.showEmp();
}
	public static void main(String[] args) {
		
		Department dept=new Department(1,"HR",new Employee(10,"amit"));
		
		System.out.println(dept);
		dept.showDept();
	}

}
