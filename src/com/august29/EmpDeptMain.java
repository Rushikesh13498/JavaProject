package com.august29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
 

public class EmpDeptMain {

	public static void highestSalary(HashMap<Employee,Department> h1) {
		
		HashMap<Employee,Department> highestsalary=new HashMap<>();
		HashMap<String, Employee>newmap=new HashMap<>();
		
		for(Map.Entry<Employee, Department>m:h1.entrySet()) {
			for(Map.Entry<Employee, Department>m1:h1.entrySet()) {
			Employee emp=m.getKey();
			Department d=m.getValue();
			
			if(m.getKey().getSalary()>m1.getKey().getSalary() && 
					m.getValue().getName().equals(m1.getValue().getName())) {
				newmap.put(m.getValue().getName(), emp);
			}
		}
	}System.out.println(newmap);
	
	}	
	
	
	public static void highSalary(HashMap<Employee,Department> h1) {
		
		HashSet<Department>set=(HashSet)h1.values();
		Iterator<Department>itr=set.iterator();
		while(itr.hasNext()) {
			Department dept=itr.next();
			
		for(Map.Entry<Employee, Department>h2:h1.entrySet()) {
			Employee emp1=h2.getKey();
			if(h2.getValue().equals(dept)) {
				if(h2.getKey().getSalary()>emp1.getSalary()) {
					emp1=h2.getKey();
				}
			}
		}
		}
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(1, "Ram", 25000);
		Employee e2=new Employee(2, "Akshay", 18000);
		Employee e3=new Employee(3, "om", 10000);
		Employee e4=new Employee(4, "Jay", 55000);
		Employee e5=new Employee(5, "Yash", 80000);
		Employee e6=new Employee(6, "Raghav", 44000);
		Employee e7=new Employee(7, "Samir", 40000);
		Employee e8=new Employee(8, "Lokesh", 20000);
		Employee e9=new Employee(9, "Karan", 22000);
		Employee e10=new Employee(10, "Amit",90000);
		Employee e11=new Employee(11, "Aman", 35000);
		Employee e12=new Employee(12, "Avyan", 46000);
		
		
		Department d1=new Department(11, "IT");
		Department d2=new Department(22, "sales");
		Department d3=new Department(33, "HR");
		Department d4=new Department(44, "Support");

		HashMap<Employee,Department>h1=new HashMap<>();
		
		h1.put(e1, d1);
		h1.put(e3, d3);
		h1.put(e2, d2);
		h1.put(e4, d4);
		h1.put(e7, d1);
		h1.put(e5, d2);
		h1.put(e6, d3);
		h1.put(e8, d4);
		h1.put(e9, d4);
		h1.put(e10, d1);
		h1.put(e12, d2);
		h1.put(e11, d3);
		
		
		
		
		System.out.println(h1);
		System.out.println("-----------------Department name with highest salary-----------------------");
		highestSalary(h1);
	}

}
