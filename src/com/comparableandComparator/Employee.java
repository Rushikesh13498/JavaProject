package com.comparableandComparator;

public class Employee implements Comparable<Employee>{

	private int empid;
	private String empname;
	private double empsal;
	private Department dept;
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, double empsal, Department dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", dept=" + dept ;
	}
	
	public int compareTo(Employee e1) {
		//return this.empid-e1.empid;
		
		return this.empname.compareTo(e1.empname);
	}
	
}
