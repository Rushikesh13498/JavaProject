package com.list;

public class Employee {

	private int eid;
	private String ename;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", salary=" + salary + "\n";
	}
	
	public static void MaxSalary() {
		Employee[] e=new Employee[5];
		double max=0;
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<i;j++) {
				if(e[i].getSalary()>e[j].getSalary()) {
					max=e[i].getSalary();
					
					System.out.println(max);
				}
				
			}
		}
		
	}
	
}
