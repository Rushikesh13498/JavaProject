package com.crud.operation;

import com.crud.pojo.Employee;

//create an array of Object
//create addemployee() method
public class EmployeeOperations {

	Employee []emparr;
	int index;
	int len,i;
	Employee e=null;
	public EmployeeOperations(){
		emparr=new Employee[5];
		index=0;
	}	
	//adding employee to emp arr
	public void addEmployee(Employee e) {
		/*for(i=index;i<n;i++) {
			emparr[i]=e;     //storing employee object
			System.out.println("Employee added at index "+index);
		}*/
		emparr[index]=e;
		System.out.println("employee added at index :"+index);
		index++;
		len=index;
		
	}
	
	public void updateEmployee(Employee e) {
		for(i=0;i<len;i++) {
			if(emparr[i]!=null && emparr[i].getEmpid()==e.getEmpid()) {
				emparr[i]=e;
				break;
			}
		}
	}
	//show employee 
	public void showEmployees() {
		//len=index;
		for(i=0;i<len;i++) {
			System.out.println(emparr[i]);
		}
		/*
		for(Employee e:emparr) {
			System.out.println(emparr[i]);
		}
		*/
		
	}
	
	public int searchEmployeeById(int empid) {
		int flag=0;
		for(i=0;i<emparr.length;i++) {
			if(emparr[i]!=null && emparr[i].getEmpid()==empid) {
				System.out.println("Employe record found");
				System.out.println(emparr[i]);
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		return flag;
	}
	
	public Employee searchEmployeeById1(int empid) {
		
		for(i=0;i<emparr.length;i++) {
			if(emparr[i]!=null && emparr[i].getEmpid()==empid) {
				System.out.println("Employe record found");
				e=emparr[i];
				break;
			}
			else {
				e=null;
			}
			
		}
		return e;
	}
}
