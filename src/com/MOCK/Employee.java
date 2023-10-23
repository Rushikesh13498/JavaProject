package com.MOCK;

class Department{
	int dept_id;
	String dept_name;

	
	
	public Department(int dept_id,String dept_name) {
		this.dept_id=dept_id;
		this.dept_name=dept_name;
		
	}
	public void ShowDept() {
		System.out.println("Department:\n"+"Department id:"+dept_id+"\n"+"Department Name:"+dept_name);
	    
	}
}

 class MyDate{
	int dd;
	int mm;
	int yyyy;
	
    public  MyDate(int dd,int mm,int yyyy) {
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
		
        
	}
	public void ShowMyDate() {
		System.out.println("Date:"+dd+"/"+mm+"/"+yyyy);
		
	}
 }

public class Employee {
	int id;
	String name;
	double salary;
	Department D;
	MyDate d;
	
	
	public Employee(int id,String name,double salary,Department D,MyDate d)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.D=D;
		this.d=d;
	}
	public void ShowEmp() {
		System.out.println("Basic Details:\n"+"Employee Id:"+id+"\n"+"Employee Name:"+name+"\n"+"Salary of Employee:"+"$"+salary);
		System.out.println("...........................................");
		D.ShowDept();
		System.out.println("...........................................");
		d.ShowMyDate();
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e1=new Employee(1465863, "Rushikesh V. Patil", 50000, new Department(222,"Accounts Department"),new MyDate(18,04,2023));
      System.out.println(e1);
      e1.ShowEmp();
	}

}
 
