package com.list;

import java.util.ArrayList;

public class EmployeeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(101,"ram",50000));
		list.add(new Employee(102,"geeta",7500));
		list.add(new Employee(103,"sachin",5200));
		list.add(new Employee(104,"pallavi",11000));
		list.add(new Employee(105,"payal",8000));
		list.add(new Employee(101,"ram",50000));
		
		System.out.println("-------------Employee list----------");
		System.out.println(list);
			
		System.out.println("---------Employee whose salary is greater than 10000------------------------");
		for(int i=0;i<list.size();i++) {
			Employee e=list.get(i);
			if(e.getSalary()>10000) {
				System.out.print(e);
			}
		}
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Checking and printing employee whose name is SACHIN is present or not ");
		System.out.println();
		boolean ispresent=false;
		for(int i=0;i<list.size();i++) {
			Employee e=list.get(i);
			String n="Sachin";
			String name=n.toLowerCase();
			String str=list.get(i).getEname().toLowerCase();
			
			if(name.equals(str)){
				ispresent=true;
				break;
			}
			
			
		}
		if(ispresent) {
			System.out.println("sachin is present in Employee Arraylist.....");
		
		}else {
			System.out.println("no emplyee found");
		}
		System.out.println();
		System.out.println("--------Employee with highest salary------------------");
		double maxsalary=Double.MIN_VALUE;
		
		
		for(Employee emp:list) {
			if(emp.getSalary()>maxsalary) {
				maxsalary=emp.getSalary();
			}
		}
		System.out.println(maxsalary);

		list.addAll(list);
		System.out.println(list);
		System.out.println("--------------------------------------------------------");
		System.out.println("After emptying an arraylist:");
		list.removeAll(list);
		System.out.println("employee list-->"+list);
		
		
	
}
}
